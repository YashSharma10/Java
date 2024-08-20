package StudentEnrollmentSystem.Service;

import java.util.List;

import StudentEnrollmentSystem.Entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student getStudentById(int sid);

	Student createStudent(Student student);

	Student updateStudent(int sid, Student student);

	void deleteStudent(int sid);

	List<Student> getAllStudentsSortedByName();
}
