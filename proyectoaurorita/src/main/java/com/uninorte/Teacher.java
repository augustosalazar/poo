package com.uninorte;

import java.util.ArrayList;

public class Teacher {

    private int id;
    private ArrayList<Course> courses;

    public Teacher(int id) {
        this.id = id;
        this.courses = new ArrayList<Course>();
    }

    public int getId() {
        return id;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public int getCoursesSize() {
        return this.courses.size();
    }

}
