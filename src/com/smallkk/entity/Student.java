package com.smallkk.entity;

import java.util.Date;

public class Student {

    private Integer sid;

    private String sname;

    private Date sage;

    private String ssex;

    private Integer sagenum;

    private Integer tid;

    //  本类里面是没得teacher的，现在添加一个teacher来进行关联
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Date getSage() {
        return sage;
    }

    public void setSage(Date sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public Integer getSagenum() {
        return sagenum;
    }

    public void setSagenum(Integer sagenum) {
        this.sagenum = sagenum;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}