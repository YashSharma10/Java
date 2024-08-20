package StudentEnrollmentSystem.DAO;

import java.util.List;

import StudentEnrollmentSystem.Entity.Instructor;

public interface InstructorDAO {
	List<Instructor> getAllInstructors();

	Instructor getInstructorById(int iid);

	Instructor addInstructor(Instructor instructor);

	Instructor updateInstructor(Instructor instructor, int iid);

	void deleteInstructor(int iid);
}
