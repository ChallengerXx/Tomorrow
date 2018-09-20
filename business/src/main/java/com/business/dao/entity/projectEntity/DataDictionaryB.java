package com.business.dao.entity.projectEntity;

public class DataDictionaryB {
    private Integer id;

    private String aId;

    private String aCode;

    private String code;

    private String codeName;

    public DataDictionaryB(Integer id, String aId, String aCode, String code, String codeName) {
        this.id = id;
        this.aId = aId;
        this.aCode = aCode;
        this.code = code;
        this.codeName = codeName;
    }

    public DataDictionaryB() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId == null ? null : aId.trim();
    }

    public String getaCode() {
        return aCode;
    }

    public void setaCode(String aCode) {
        this.aCode = aCode == null ? null : aCode.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }
}