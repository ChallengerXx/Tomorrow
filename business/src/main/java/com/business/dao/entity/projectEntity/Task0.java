package com.business.dao.entity.projectEntity;

public class Task0 {
    private String taskNo;

    private String status;

    private String result;

    public Task0(String taskNo, String status, String result) {
        this.taskNo = taskNo;
        this.status = status;
        this.result = result;
    }

    public Task0() {
        super();
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}