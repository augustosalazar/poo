package com.uninorte;
import java.util.ArrayList;

public class AuroritaClase {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public AuroritaClase() {
        this.teachers = new ArrayList<Teacher>();
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<Course>();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void addTeacher(int id) {
        Teacher teacher = new Teacher(id);
        this.teachers.add(teacher);
    }

    public void addStudent(int id) {
        Student student = new Student(id);
        this.students.add(student);
    }

    public void addCourse(int id, int teacherId) {
        Teacher teacher = this.teachers.stream().filter(t -> t.getId() == teacherId).findFirst().orElse(null);
        Course course = new Course(id, teacher);
        this.courses.add(course);
    }
    
}
