package com.business.dao.entity.projectEntity;

public class DataDictionaryA {
    private Integer id;

    private String code;

    private String codeName;

    public DataDictionaryA(Integer id, String code, String codeName) {
        this.id = id;
        this.code = code;
        this.codeName = codeName;
    }

    public DataDictionaryA() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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