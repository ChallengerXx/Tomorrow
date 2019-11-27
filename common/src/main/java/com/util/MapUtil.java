package com.util;

import com.bean.Coordinates;
import lombok.extern.slf4j.Slf4j;

/**
 * 地图工具类
 */
@Slf4j
public class MapUtil {

    public static final double EARTH_RADIUS = 6371.393;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * 计算两个经纬度之间的距离
     *
     * @param lat1
     * @param lng1
     * @param lat2
     * @param lng2
     * @return
     */
    public static double getDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(
                Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 1000);
        return s;
    }

    /**
     * 百度地图 获取给定经纬度和半径距离的经纬度范围
     *
     * @param lat
     *            纬度
     * @param lon
     *            经度
     * @param raidus
     *            单位:m
     * @return
     */
    public static Coordinates getAround(double lon, double lat, int raidus) {
        Coordinates resu = new Coordinates();
        Double latitude = lat;
        Double longitude = lon;

        Double degree = (24901 * 1609) / 360.0;
        double raidusMile = raidus;

        Double dpmLat = 1 / degree;
        Double radiusLat = dpmLat * raidusMile;
        Double minLat = latitude - radiusLat;
        Double maxLat = latitude + radiusLat;

        Double mpdLng = Math.abs(degree * Math.cos(latitude * (Math.PI / 180)));
        Double dpmLng = 1 / mpdLng;
        Double radiusLng = dpmLng * raidusMile;
        Double minLng = longitude - radiusLng;
        Double maxLng = longitude + radiusLng;

        log.info("dlng------------------>" + lon);
        log.info("dlat------------------>" + lat);
        log.info("minlat------------------>" + minLat);
        log.info("maxlat------------------>" + maxLat);
        log.info("minlng------------------>" + minLng);
        log.info("maxlng------------------>" + maxLng);

        resu.setMinlat(minLat);
        resu.setMinlng(minLng);
        resu.setMaxlat(maxLat);
        resu.setMaxlng(maxLng);

        return resu;
    }
}
