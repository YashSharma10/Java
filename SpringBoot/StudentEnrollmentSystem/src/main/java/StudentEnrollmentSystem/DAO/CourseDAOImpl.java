package StudentEnrollmentSystem.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import StudentEnrollmentSystem.Entity.Course;

import java.util.List;

@Repository
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Course> getAllCourses() {
        return jdbcTemplate.query("SELECT * FROM Course", new BeanPropertyRowMapper<>(Course.class));
    }

    @SuppressWarnings("deprecation")
	@Override
    public Course getCourseById(int cid) {
        return jdbcTemplate.queryForObject("SELECT * FROM Course WHERE cid=?", new Object[]{cid},
                new BeanPropertyRowMapper<>(Course.class));
    }

    @Override
    public void addCourse(Course course) {
        jdbcTemplate.update("INSERT INTO Course (cid , cname) VALUES (?,?)",
                course.getCid(), course.getCname());
    }

    @Override
    public void updateCourse(Course updatedCourse) {
        jdbcTemplate.update("UPDATE Course SET cname=? WHERE cid=?",
                updatedCourse.getCname(), updatedCourse.getCid());
    }

    @Override
    public void deleteCourse(int cid) {
        jdbcTemplate.update("DELETE FROM course WHERE cid=?", cid);
    }
}
