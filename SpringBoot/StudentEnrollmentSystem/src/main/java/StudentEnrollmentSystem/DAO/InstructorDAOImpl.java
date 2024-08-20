package StudentEnrollmentSystem.DAO;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import StudentEnrollmentSystem.Entity.Instructor;

import java.util.List;

@Repository
public class InstructorDAOImpl implements InstructorDAO {

    private final JdbcTemplate jdbcTemplate;

    public InstructorDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return jdbcTemplate.query("SELECT * FROM instructor", new BeanPropertyRowMapper<>(Instructor.class));
    }

    @SuppressWarnings("deprecation")
	@Override
    public Instructor getInstructorById(int iid) {
        return jdbcTemplate.queryForObject("SELECT * FROM instructor WHERE iid=?", new Object[]{iid},
                new BeanPropertyRowMapper<>(Instructor.class));
    }

    @Override
    public Instructor addInstructor(Instructor instructor) {
        jdbcTemplate.update("INSERT INTO instructor (iid , iname) VALUES (? ,?)", instructor.getIId() ,instructor.getIname());
        return instructor;
    }

    @Override
    public Instructor updateInstructor(Instructor updatedInstructor, int iid) {
        jdbcTemplate.update("UPDATE instructor SET iname=? WHERE iid=?", updatedInstructor.getIname(), iid);
        return updatedInstructor;
    }

    @Override
    public void deleteInstructor(int iid) {
        jdbcTemplate.update("DELETE FROM instructor WHERE iid=?", iid);
    }
}
