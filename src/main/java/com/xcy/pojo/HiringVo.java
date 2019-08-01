package com.xcy.pojo;

public class HiringVo extends Hiring {
    private String education;
    private String experience;
    private Job job;

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "HiringVo{" +
                "education='" + education + '\'' +
                ", experience='" + experience + '\'' +
                ", job=" + job +
                '}';
    }
}
