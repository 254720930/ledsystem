package com.xcy.pojo;

public class Job {
    private int id;
    private String jobName;
    private String jobType;
    private String positionStatement;
    private String jobRequired;
    private String welfare;
    private String workTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getPositionStatement() {
        return positionStatement;
    }

    public void setPositionStatement(String positionStatement) {
        this.positionStatement = positionStatement;
    }

    public String getJobRequired() {
        return jobRequired;
    }

    public void setJobRequired(String jobRequired) {
        this.jobRequired = jobRequired;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobName='" + jobName + '\'' +
                ", jobType='" + jobType + '\'' +
                ", positionStatement='" + positionStatement + '\'' +
                ", jobRequired='" + jobRequired + '\'' +
                ", welfare='" + welfare + '\'' +
                ", workTime='" + workTime + '\'' +
                '}';
    }
}
