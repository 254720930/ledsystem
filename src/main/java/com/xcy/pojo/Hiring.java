package com.xcy.pojo;

public class Hiring {
    private int id;
    private String title;
    private int num;
    private String salary;
    private int educationId;
    private int expId;
    private int jobId;
    private String createTime;
    private String workplace;
    private String deadline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public int getExpId() {
        return expId;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Hiring{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", num=" + num +
                ", salary='" + salary + '\'' +
                ", educationId=" + educationId +
                ", expId=" + expId +
                ", jobId=" + jobId +
                ", createTime='" + createTime + '\'' +
                ", workplace='" + workplace + '\'' +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}
