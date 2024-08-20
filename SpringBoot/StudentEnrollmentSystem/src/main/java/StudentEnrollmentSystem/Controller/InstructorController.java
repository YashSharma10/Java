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

import StudentEnrollmentSystem.Entity.Instructor;
import StudentEnrollmentSystem.Service.InstructorService;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

//    public InstructorController(@Qualifier("instructorServiceImpl") InstructorService instructorService) {
//        this.instructorService = instructorService;
//    }

    @GetMapping("/instructors")
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @GetMapping("/instructors/{iid}")
    public Instructor getInstructorById(@PathVariable int iid) {
        return instructorService.getInstructorById(iid);
    }

    @PostMapping("/instructors")
    public Instructor createInstructor(@RequestBody Instructor instructor) {
        return instructorService.createInstructor(instructor);
    }

    @PutMapping("/instructors/{iid}")
    public Instructor updateInstructor(@PathVariable int iid, @RequestBody Instructor instructor) {
        return instructorService.updateInstructor(iid, instructor);
    }

    @DeleteMapping("/instructors/{iid}")
    public void deleteInstructor(@PathVariable int iid) {
        instructorService.deleteInstructor(iid);
    }
}
