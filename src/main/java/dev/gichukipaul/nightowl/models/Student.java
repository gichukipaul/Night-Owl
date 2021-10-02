package dev.gichukipaul.nightowl.models;

import java.util.List;

public class Student {
    private String id;
    private String first_name;
    private String second_name;
    private String REG_NO;
    private List<Course> courseList;

    public Student() {
    }

    public Student(String id, String first_name, String second_name, String REG_NO, List<Course> courseList) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.REG_NO = REG_NO;
        this.courseList = courseList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getREG_NO() {
        return REG_NO;
    }

    public void setREG_NO(String REG_NO) {
        this.REG_NO = REG_NO;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
