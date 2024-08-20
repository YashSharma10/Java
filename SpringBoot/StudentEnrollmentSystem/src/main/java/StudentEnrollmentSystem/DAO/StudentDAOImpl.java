package StudentEnrollmentSystem.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import StudentEnrollmentSystem.Entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getAllStudents() {
        return jdbcTemplate.query("SELECT * FROM student", new BeanPropertyRowMapper<>(Student.class));
    }

    @SuppressWarnings("deprecation")
	@Override
    public Student getStudentById(int sid) {
        return jdbcTemplate.queryForObject("SELECT * FROM student WHERE sid=?", new Object[] { sid },
                new BeanPropertyRowMapper<>(Student.class));
    }

    @Override
    public Student addStudent(Student student) {
        int rowsAffected = jdbcTemplate.update("INSERT INTO student (sid, sname, semail) VALUES (?, ?, ?)",
                student.getSid(), student.getSname(), student.getSemail());
        if (rowsAffected == 1) {
            return student;
        } else {
            // Handle failure to insert student
            return null;
        }
    }

    @Override
    public Student updateStudent(Student student, int sid) {
        int rowsAffected = jdbcTemplate.update("UPDATE student SET sname=?, semail=? WHERE sid=?", 
                student.getSname(), student.getSemail(), sid);
        if (rowsAffected == 1) {
            return student;
        } else {
            return null;
        }
    }

    @Override
    public void deleteStudent(int sid) {
        jdbcTemplate.update("DELETE FROM student WHERE Sid=?", sid);
    }

    @Override
    public List<Student> getAllStudentsSortedByName() {
        return jdbcTemplate.query("SELECT * FROM student ORDER BY sname", new BeanPropertyRowMapper<>(Student.class));
    }
}
