import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.Course;
import com.uninorte.Student;
import com.uninorte.Teacher;

public class TestAurorita {
    
    @Test
    public void testCourse() {
        Teacher teacher = new Teacher(1);
        Course course = new Course(1, teacher);
        assertEquals(1, course.getId());
        assertEquals(teacher, course.getTeacher());
    }

    @Test
    public void testTeacher() {
        Teacher teacher = new Teacher(1);
        assertEquals(1, teacher.getId());
    }

    @Test
    public void testTeacherAddCourse() {
        Teacher teacher = new Teacher(1);
        Course course = new Course(1, teacher);
        teacher.addCourse(course);
        assertEquals(1, teacher.getId());
        assertEquals(1, teacher.getCoursesSize());
    }

    @Test
    public void testCourseAddStudent() {
        Teacher teacher = new Teacher(1);
        Course course = new Course(1, teacher);
        course.addStudent(null);
        assertEquals(1, course.getStudentsSize());
    }

    @Test
    public void testCourseAddGrade() {
        Teacher teacher = new Teacher(1);
        Course course = new Course(1, teacher);
        course.addStudent(new Student(1));
        course.addStudent(new Student(2));
        course.addGrade(1, 2.0f);
        course.addGrade(2, 3.5f);
        assertEquals(2, course.getStudentsSize());
        assertEquals(2.0f, course.getGrade(1));
        assertEquals(3.5f, course.getGrade(2));
    }

}
