package StudentEnrollmentSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StudentEnrollmentSystem.DAO.CourseDAO;
import StudentEnrollmentSystem.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDAO courseDAO;

    @Override
    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }

    @Override
    public Course getCourseById(int cid) {
        return courseDAO.getCourseById(cid);
    }

    @Override
    public Course createCourse(Course course) {
        courseDAO.addCourse(course);
        return course;
    }

    @Override
    public Course updateCourse(int cid, Course course) {
        courseDAO.updateCourse(course);
        return course;
    }

    @Override
    public void deleteCourse(int cid) {
        courseDAO.deleteCourse(cid);
    }
}
