package com.example.final_practice.controller;

import com.example.final_practice.entity.Appointment;
import com.example.final_practice.repository.AppointmentRepository;
import com.example.final_practice.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uds/api/appointment/get/patient")
public class AppointmentRestController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/list")
    public ResponseEntity<List<Appointment>> showAll(){
        List<Appointment> appointments = appointmentService.getAll();

        return ResponseEntity.ok(appointments);

    }
    @GetMapping(value = {"/{name}"})
    public List<Appointment> findProductByName(@PathVariable String name){
        return appointmentService.getByName(name);
    }

//    @PostMapping("/register")
//    public ResponseEntity<Appointment> saveCustomer(@RequestBody Appointment appointment) {
//        appointment = appointmentService.saveData(appointment);
//
//
//        return ResponseEntity.ok(appointment);
//
//    }


}
