package com.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 文件导入导出工具类
 */
@Slf4j
public class ImportUtil {

    private ImportUtil(){}

    /**
     * excel文件导入
     *
     * @param ins
     * @return
     */
    public static List<String[]> importExcel(InputStream ins) {
        List<String[]> dataList = new ArrayList<>();
        // 创建工作簿
        Workbook workbook = null;
        ByteArrayOutputStream bos = cloneInputStream(ins);
        try {
            try {
                workbook = new XSSFWorkbook(new ByteArrayInputStream(bos.toByteArray()));
            } catch (Exception ex) {
                try {
                    workbook = new HSSFWorkbook(new ByteArrayInputStream(bos.toByteArray()));
                } catch (Exception e) {
                    log.error("EXCEL有误！", e);
                    return dataList;
                }
            }
            String[] data;
            int sheetNumber = workbook.getNumberOfSheets();// 总sheet数量
            for (int i = 0; i < sheetNumber; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                if (sheet != null) {
                    int rowTotalNumber = sheet.getLastRowNum();// 获取sheet下总行数
                    log.info("共计{}行", rowTotalNumber);
                    Row titleRow = sheet.getRow(0);// 通过title获取列数
                    int cellTotalNumber = 0;
                    if (titleRow != null) {
                        cellTotalNumber = titleRow.getLastCellNum();
                    }
                    if (cellTotalNumber < 1) {
                        log.error("EXCEL内容错误！");
                    }
                    // 遍历行
                    for (int rowNumber = 1; rowNumber <= rowTotalNumber; rowNumber++) {
                        data = new String[cellTotalNumber];
                        Row row = sheet.getRow(rowNumber);
                        // 遍历行下面列
                        if (row != null) {
                            for (int cellNumber = 0; cellNumber < cellTotalNumber; cellNumber++) {
                                // 赋值
                                data[cellNumber] = getValue(row.getCell(cellNumber));
                            }
                            dataList.add(data);
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (workbook != null){
                try {
                    workbook.close();
                } catch (IOException e1) {
                    log.error("文件导入error",e1);
                }
            }
        }
        return dataList;
    }

    /**
     * csv文件导入
     *
     * @param ins
     * @return
     */
    public static List<String[]> importCsv(InputStream ins) {
        List<String[]> dataList = new ArrayList<>();
        BufferedReader reader = null;
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(ins, Charset.forName("utf-8"));
            reader = new BufferedReader(isr);
            String title = reader.readLine();// title备注不需要
            log.info("title：" + title);
            String content;
            while ((content = reader.readLine()) != null) {
                String[] contentArray = content.split(",");
                dataList.add(contentArray);
            }

        } catch (IOException e) {
            log.error("csv文件导入error", e);
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    log.error("关闭文件流error",e);
                }
            }
            if (isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    log.error("关闭文件流error",e);
                }
            }
        }
        return dataList;
    }

    /**
     * 复制流
     *
     * @param ins
     * @return
     */
    private static ByteArrayOutputStream cloneInputStream(InputStream ins) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = ins.read(buffer)) > -1) {
                bos.write(buffer, 0, length);
            }

            bos.flush();
        } catch (IOException e) {
            log.error("复制流error", e);
        }
        return bos;
    }

    /**
     * 获取值
     *
     * @param cell
     * @return
     */
    private static String getValue(Cell cell) {
        if (cell != null) {
            if (cell.getCellType() == 4) {
                return String.valueOf(cell.getBooleanCellValue()).trim();
            } else if (cell.getCellType() == 0) {
                DecimalFormat df = new DecimalFormat("0");
                return df.format(cell.getNumericCellValue());
            } else {
                return String.valueOf(cell.getStringCellValue()).trim();
            }
        } else {
            return "";
        }
    }

    /**
     * 导出excel数据
     *
     * @param dataList
     */
    public static void exportFile(List<String[]> dataList, String filePath) {
        log.info("文件地址：{}", filePath);
        HSSFWorkbook wb = null;
        FileOutputStream fos = null;
        try {
            File file = new File(filePath);
            fos = new FileOutputStream(file);
            wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet();
            HSSFCell cell;
            HSSFRow row;
            // 获取对象
            if (!CollectionUtils.isEmpty(dataList)) {
                for (int i = 0, listLength = dataList.size(); i < listLength; i++) {
                    String[] dataArr = dataList.get(i);
                    row = sheet.createRow(i);
                    // 设置cell值
                    for (int j = 0, fieldLength = dataArr.length; j < fieldLength; j++) {
                        cell = row.createCell(j);
                        String data = dataArr[j];
                        if (!StringUtils.isEmpty(data)) {
                            cell.setCellValue(data);
                        }
                    }
                }
            }
            wb.write(fos);
            log.info("导出成功");
        } catch (Exception e) {
            log.error("导出异常！", e);
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    log.error("error",e);
                } finally {
                    if (wb != null){
                        try {
                            wb.close();
                        } catch (IOException e) {
                            log.error("error",e);
                        }
                    }
                }
            }
        }
    }

    /**
     * 导出文件到csv文件中
     * @param dataList 数据集合
     * @param filePath 文件地址
     */
    public static void exportCsvFile(List<String[]> dataList, String filePath){
        BufferedWriter writer = null;
        OutputStreamWriter osw = null;
        FileOutputStream fis = null;
        try {
            fis = new FileOutputStream(filePath);
            osw = new OutputStreamWriter(fis, Charset.forName("utf-8"));
            writer = new BufferedWriter(osw);
            for(String[] data : dataList){
                writer.write(Stream.of(data).collect(Collectors.joining(",")) + "\r");
            }
            writer.flush();
            log.info("导出成功！");
        } catch (Exception e) {
            log.error("error",e);
        } finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    log.error("error",e);
                }
            }
            if (osw != null){
                try {
                    osw.close();
                } catch (IOException e) {
                    log.error("error",e);
                }
            }
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    log.error("error",e);
                }
            }
        }
    }
}
