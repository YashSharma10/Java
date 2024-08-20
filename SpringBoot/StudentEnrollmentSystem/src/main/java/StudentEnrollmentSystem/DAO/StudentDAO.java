package StudentEnrollmentSystem.DAO;

import java.util.List;

import StudentEnrollmentSystem.Entity.Student;

public interface StudentDAO {
	List<Student> getAllStudents();

	Student getStudentById(int sid);

	Student addStudent(Student student);

	Student updateStudent(Student student , int sid);

	void deleteStudent(int sid);

	List<Student> getAllStudentsSortedByName();
}
