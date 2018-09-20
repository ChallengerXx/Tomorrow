package com.business.dao.entity.projectEntity;

public class Areas {
    private Integer id;

    private Integer parentid;

    private String name;

    private String shortname;

    private String mergershortname;

    private String leveltype;

    private String citycode;

    private String zipcode;

    private String remark;

    public Areas(Integer id, Integer parentid, String name, String shortname, String mergershortname, String leveltype, String citycode, String zipcode, String remark) {
        this.id = id;
        this.parentid = parentid;
        this.name = name;
        this.shortname = shortname;
        this.mergershortname = mergershortname;
        this.leveltype = leveltype;
        this.citycode = citycode;
        this.zipcode = zipcode;
        this.remark = remark;
    }

    public Areas() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getMergershortname() {
        return mergershortname;
    }

    public void setMergershortname(String mergershortname) {
        this.mergershortname = mergershortname == null ? null : mergershortname.trim();
    }

    public String getLeveltype() {
        return leveltype;
    }

    public void setLeveltype(String leveltype) {
        this.leveltype = leveltype == null ? null : leveltype.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}