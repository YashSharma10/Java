package StudentEnrollmentSystem.Service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StudentEnrollmentSystem.DAO.StudentDAO;
import StudentEnrollmentSystem.Entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDao;

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = studentDao.getAllStudents();
        Collections.sort(students); 
        return students;
    }
    
    @Override
    public List<Student> getAllStudentsSortedByName() {
        return studentDao.getAllStudentsSortedByName();
    }

    @Override
    public Student getStudentById(int sid) {
        return studentDao.getStudentById(sid);
    }

    @Override
    public Student createStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Student updateStudent(int sid, Student student) {
        return studentDao.updateStudent(student, sid);
    }

    @Override
    public void deleteStudent(int sid) {
        studentDao.deleteStudent(sid);
    }
}
