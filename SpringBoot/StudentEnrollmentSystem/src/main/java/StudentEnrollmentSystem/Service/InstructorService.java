package StudentEnrollmentSystem.Service;

import java.util.List;

import StudentEnrollmentSystem.Entity.Instructor;

public interface InstructorService {
    List<Instructor> getAllInstructors();

    Instructor getInstructorById(int iid);

    Instructor createInstructor(Instructor instructor);

    Instructor updateInstructor(int iid, Instructor instructor);

    void deleteInstructor(int iid);
}
