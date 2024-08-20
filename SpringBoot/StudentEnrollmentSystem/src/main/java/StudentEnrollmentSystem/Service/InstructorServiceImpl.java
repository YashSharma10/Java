package StudentEnrollmentSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StudentEnrollmentSystem.DAO.InstructorDAO;
import StudentEnrollmentSystem.Entity.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorDAO instructorDAO;

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorDAO.getAllInstructors();
    }

    @Override
    public Instructor getInstructorById(int iid) {
        return instructorDAO.getInstructorById(iid);
    }

    @Override
    public Instructor createInstructor(Instructor instructor) {
        return instructorDAO.addInstructor(instructor);
    }

    @Override
    public Instructor updateInstructor(int iid, Instructor instructor) {
        return instructorDAO.updateInstructor(instructor, iid);
    }

    @Override
    public void deleteInstructor(int iid) {
        instructorDAO.deleteInstructor(iid);
    }
}
