package com.example.final_practice.repository;

import com.example.final_practice.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

 List<Appointment> findAppointmentByPatientNumber(String name);

    //List<Appointment> findCustomerByFirstNameOrLastNameOrMiddleNameOrderByNumberOfRewardPointsEarnedDesc(String fName, String lName, String mName);

    //List<Appointment> findCustomerByFullNameOrderByFullNameAsc(String fName);



//    @Query("SELECT p FROM Appointment p WHERE p.fullName = :name ORDER BY p.fullName asc")
//    List<Appointment> findPatientByFullNameAsc(String name);


}
