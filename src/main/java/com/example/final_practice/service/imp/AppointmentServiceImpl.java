package com.example.final_practice.service.imp;

import com.example.final_practice.entity.Appointment;
import com.example.final_practice.repository.AppointmentRepository;
import com.example.final_practice.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAll() {

        return appointmentRepository.findAll(Sort.by(Sort.Direction.ASC, "appointmentDate","appointmentTime"));
    }

    @Override
    public List<Appointment> getByName(String name) {
        return appointmentRepository.findAppointmentByPatientNumber(name);
    }

//    public Appointment getById(String patientNumber){
//
//        Optional<Appointment> appointment = appointmentRepository.findById(patientNumber);
//
//        if(appointment.isPresent()){
//            return appointment.get();
//        }
//        return null;
//    }

    @Override
    public Appointment saveData(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

//    @Override
//    public List<Appointment> search(String nameText) {
//        return appointmentRepository.findCustomerByFullNameOrderByFullNameAsc(nameText);
//    }
}
