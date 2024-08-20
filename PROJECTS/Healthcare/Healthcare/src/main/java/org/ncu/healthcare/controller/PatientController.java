package org.ncu.healthcare.controller;

import java.util.List;

import org.ncu.healthcare.dao.PatientDAO;
import org.ncu.healthcare.entity.Appointment;
import org.ncu.healthcare.entity.MedicalRecord;
import org.ncu.healthcare.entity.Patient;
import org.ncu.healthcare.entity.Prescription;
import org.ncu.healthcare.entity.User;
import org.ncu.healthcare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
	 @Autowired
	    private PatientDAO patientDAO;
	 @Autowired
	    private UserService userService;


	    @GetMapping("/{patientId}")
	    public Patient getPatientById(@PathVariable int patientId) {
	    	
	        return patientDAO.getPatientById(patientId);
	    }

	    @PostMapping
	    public Patient savePatient(@RequestBody Patient patient) {
	    	if (patient.getUser() == null) {
	    	    throw new IllegalArgumentException("User is required for creating a patient.");
	    	}

	    	User user = userService.findById(patient.getUser().getUserId());
	    	if (user == null) {
	    	    throw new IllegalArgumentException("User with ID " + patient.getUser().getUserId() + " does not exist.");
	    	}

	    	patient.setUser(user);
	    	return patientDAO.saveOrUpdatePatient(patient);
	       
	    }

	    @PutMapping
	    public Patient updatePatient(@RequestBody Patient patient) {
	        return patientDAO.saveOrUpdatePatient(patient);
	    }

	    @DeleteMapping("/{patientId}")
	    public void deletePatient(@PathVariable int patientId) {
	        patientDAO.deletePatient(patientId);
	    }

	    @GetMapping
	    public List<Patient> getAllPatients() {
	        return patientDAO.getAllPatients();
	    }
	    
	    
	    // Book Appointment for Patient
	    @PostMapping("/{patientId}/appointments")
	    public void bookAppointmentForPatient(@PathVariable int patientId, @RequestBody Appointment appointment) {
	        patientDAO.bookAppointment(patientId, appointment);
	    }

	    // Add Prescription for Patient
	    @PostMapping("/{patientId}/prescriptions")
	    public void addPrescriptionForPatient(@PathVariable int patientId, @RequestBody Prescription prescription) {
	        patientDAO.addPrescription(patientId, prescription);
	    }

	    // Get Medical Records for Patient
	    @GetMapping("/{patientId}/medicalRecords")
	    public List<MedicalRecord> getMedicalRecordsForPatient(@PathVariable int patientId) {
	        return patientDAO.getMedicalRecords(patientId);
	    }

}
