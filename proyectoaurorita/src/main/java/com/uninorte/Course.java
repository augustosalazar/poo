package com.uninorte;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private int id;
    private Teacher teacher;
    private ArrayList<Student> students;
    private HashMap<Integer , Grade> grades;

    public Course(int id, Teacher teacher) {
        this.id = id;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
        this.grades = new HashMap<Integer , Grade>();
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addGrade(int idStudent, float grade) {
        Grade g = new Grade(grade);
        this.grades.put(idStudent, g);
    }

    public int getStudentsSize() {
        return this.students.size();
    }

    public float getGrade(int idStudent) {
        return this.grades.get(idStudent).getValue();
    }
    
}
