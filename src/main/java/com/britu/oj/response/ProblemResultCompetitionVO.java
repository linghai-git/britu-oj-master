package com.britu.oj.response;

import java.util.Date;

/**
 * @author m969130721@163.com
 * @date 19-2-16 下午5:32
 */
public class ProblemResultCompetitionVO {

    private Integer id;

    private Integer userId;

    private String problemId;

    private String problemName;

    private Integer compId;

    private String runNum;

    private Integer status;

    private String type;

    private Long time;

    private Long memory;

    private Date createTime;

    private Date updateTime;

    /**
     * 通过组数
     */
    private Integer acCount = 0;

    private Integer score = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public String getRunNum() {
        return runNum;
    }

    public void setRunNum(String runNum) {
        this.runNum = runNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAcCount() {
        return acCount;
    }

    public void setAcCount(Integer acCount) {
        this.acCount = acCount;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ProblemResultCompetitionVO{" +
                "id=" + id +
                ", userId=" + userId +
                ", problemId=" + problemId +
                ", problemName='" + problemName + '\'' +
                ", compId=" + compId +
                ", runNum='" + runNum + '\'' +
                ", status=" + status +
                ", type='" + type + '\'' +
                ", time=" + time +
                ", memory=" + memory +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", acCount=" + acCount +
                ", score=" + score +
                '}';
    }
}
