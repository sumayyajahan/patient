package com.example.final_practice.controller;

import com.example.final_practice.entity.Appointment;
import com.example.final_practice.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/index")
    public String getAllCustomer(Model model){

        List<Appointment> appointments = appointmentService.getAll();
        model.addAttribute("appointments", appointments);

        return "index";
    }
    @GetMapping("/getForm")
    public String saveCustomer(Model model){

        model.addAttribute("patient", new Appointment());

        return "form";
    }

    @PostMapping("/save")
    public String saveCustomer(Appointment appointment, Model model){
        appointment = appointmentService.saveData(appointment);
        model.addAttribute("msg", "Data added successfully.");

        return "redirect:/index";

    }
//    @GetMapping("/search")
//    public String searchPatient(@RequestParam("searchText") String searchText, Model model){
//
//        if(searchText.isBlank()){
//            return getAllCustomer(model);
//        }
//
//        List<Appointment> appointments = appointmentService.search(searchText);
//        model.addAttribute("patients", appointments);
//        model.addAttribute("searchText", searchText);
//
//        return "index";
//
//    }
}
