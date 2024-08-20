package StudentEnrollmentSystem.Service;

import java.util.List;

import StudentEnrollmentSystem.Entity.Course;

public interface CourseService {
    List<Course> getAllCourses();

    Course getCourseById(int cid);

    Course createCourse(Course course);

    Course updateCourse(int cid, Course course);

    void deleteCourse(int cid);
}
