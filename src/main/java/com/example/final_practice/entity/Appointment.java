package com.example.final_practice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "appoinments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long appointmentId;

    @NotNull(message = "patient Number can't be null")
    @Column(nullable = false)
    private String patientNumber;

    @NotBlank(message = "patientName can't be blank")
    @Column(nullable = false)
    private String patientName;

    @NotBlank(message = "dentistName can't be blank")
    @Column(nullable = false)
    private String dentistName;

    @Column(nullable = true)
    private String surgeryLocation;


    @NotNull(message = "appointmentDate can't be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    private LocalDate appointmentDate;

    @NotNull(message = "localTime can't be null")
    @DateTimeFormat(pattern = "HH:mm:ss")
    @Column(nullable = false)
    private LocalTime appointmentTime;

}
