package StudentEnrollmentSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StudentEnrollmentSystem.Entity.Student;
import StudentEnrollmentSystem.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;


	@GetMapping("/students")
    public List<Student> fetchStudent() {
        return studentService.getAllStudents();
    }
	
	@GetMapping("/students/sortedByName")
    public List<Student> fetchStudentSortedByName() {
        return studentService.getAllStudentsSortedByName();
    }

	@GetMapping("/students/{sid}")
	public Student fetchStudent(@PathVariable int sid) {
		return studentService.getStudentById(sid);
	}

	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@PutMapping("/students/{sid}")
	public Student updateStudent(@PathVariable int sid, @RequestBody Student student) {
		return studentService.updateStudent(sid, student);
	}

	@DeleteMapping("/students/{sid}")
	public void deleteStudent(@PathVariable int sid) {
		studentService.deleteStudent(sid);
	}

}
