package com.example.final_practice.service;

import com.example.final_practice.entity.Appointment;

import java.util.List;

public interface AppointmentService {

    List<Appointment> getAll();

   List<Appointment> getByName(String name);

    Appointment saveData(Appointment appointment);

//    List<Appointment> search(String nameText);

}
