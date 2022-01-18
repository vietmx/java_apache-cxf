package com.maixuanviet.cxf.aegis;

import java.util.HashMap;
import java.util.Map;

public class CourseRepoImpl implements CourseRepo {
    private String greeting;
    private Map<Integer, Course> courses = new HashMap<Integer, Course>();

    @Override
    public String getGreeting() {
        return greeting;
    }

    @Override
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public Map<Integer, Course> getCourses() {
        return courses;
    }

    @Override
    public void setCourses(Map<Integer, Course> courses) {

    }

    @Override
    public void addCourse(Course course) {

    }


}