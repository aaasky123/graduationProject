package com.wxj.entity;

public class WorkFlowMark {
    private Long id;

    private Long workId;

    private Integer workFlowId;

    private Long createUserId;

    private String markContent;

    private Long markTime;

    public WorkFlowMark(Long id, Long workId, Integer workFlowId, Long createUserId, String markContent, Long markTime){
        this.id=id;
        this.workId=workId;
        this.workFlowId=workFlowId;
        this.createUserId=createUserId;
        this.markContent=markContent;
        this.markTime=markTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public Integer getWorkFlowId() {
        return workFlowId;
    }

    public void setWorkFlowId(Integer workFlowId) {
        this.workFlowId = workFlowId;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getMarkContent() {
        return markContent;
    }

    public void setMarkContent(String markContent) {
        this.markContent = markContent == null ? null : markContent.trim();
    }

    public Long getMarkTime() {
        return markTime;
    }

    public void setMarkTime(Long markTime) {
        this.markTime = markTime;
    }
}
