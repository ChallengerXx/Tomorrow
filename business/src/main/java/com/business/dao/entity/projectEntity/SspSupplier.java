package com.business.dao.entity.projectEntity;

public class SspSupplier {
    private Integer id;

    private Integer saleSwitch;

    private String supplierMark;

    private String supplierName;

    private Integer updateMan;

    private Integer updateTime;

    public SspSupplier(Integer id, Integer saleSwitch, String supplierMark, String supplierName, Integer updateMan, Integer updateTime) {
        this.id = id;
        this.saleSwitch = saleSwitch;
        this.supplierMark = supplierMark;
        this.supplierName = supplierName;
        this.updateMan = updateMan;
        this.updateTime = updateTime;
    }

    public SspSupplier() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSaleSwitch() {
        return saleSwitch;
    }

    public void setSaleSwitch(Integer saleSwitch) {
        this.saleSwitch = saleSwitch;
    }

    public String getSupplierMark() {
        return supplierMark;
    }

    public void setSupplierMark(String supplierMark) {
        this.supplierMark = supplierMark == null ? null : supplierMark.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Integer getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(Integer updateMan) {
        this.updateMan = updateMan;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}