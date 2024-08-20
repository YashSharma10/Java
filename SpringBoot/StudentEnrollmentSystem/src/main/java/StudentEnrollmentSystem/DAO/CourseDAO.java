package StudentEnrollmentSystem.DAO;

import java.util.List;

import StudentEnrollmentSystem.Entity.Course;

public interface CourseDAO {
	List<Course> getAllCourses();

	Course getCourseById(int cid);

	void addCourse(Course course);

	void updateCourse(Course course);

	void deleteCourse(int cid);
}
