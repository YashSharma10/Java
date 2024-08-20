package org.ncu.healthcare.controller;

import org.ncu.healthcare.entity.Doctor;
import org.ncu.healthcare.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.saveOrUpdateDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable int doctorId) {
        return doctorService.getDoctorById(doctorId);
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable int doctorId, @RequestBody Doctor doctor) {
        return doctorService.saveOrUpdateDoctor(doctor);
    }

    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable int doctorId) {
        doctorService.deleteDoctor(doctorId);
        return "Doctor with ID " + doctorId + " deleted successfully";
    }
}
