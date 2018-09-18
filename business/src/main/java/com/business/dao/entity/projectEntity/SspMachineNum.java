package com.business.dao.entity.projectEntity;

public class SspMachineNum {
    private Integer id;

    private String machineNum;

    private String flag;

    private Integer scrType;

    public SspMachineNum(Integer id, String machineNum, String flag, Integer scrType) {
        this.id = id;
        this.machineNum = machineNum;
        this.flag = flag;
        this.scrType = scrType;
    }

    public SspMachineNum() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(String machineNum) {
        this.machineNum = machineNum == null ? null : machineNum.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Integer getScrType() {
        return scrType;
    }

    public void setScrType(Integer scrType) {
        this.scrType = scrType;
    }
}