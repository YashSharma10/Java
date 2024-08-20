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

import StudentEnrollmentSystem.Entity.Course;
import StudentEnrollmentSystem.Service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

//    public CourseController(@Qualifier("courseServiceImpl") CourseService courseService) {
//        this.courseService = courseService;
//    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{cid}")
    public Course getCourseById(@PathVariable int cid) {
        return courseService.getCourseById(cid);
    }

    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("/courses/{cid}")
    public Course updateCourse(@PathVariable int cid, @RequestBody Course course) {
        return courseService.updateCourse(cid, course);
    }

    @DeleteMapping("/courses/{cid}")
    public void deleteCourse(@PathVariable int cid) {
        courseService.deleteCourse(cid);
    }
}
