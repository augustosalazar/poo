package com.uninorte;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {

    private int id;
    private ArrayList<Course> courses;
    
    public Student(int id) {
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
