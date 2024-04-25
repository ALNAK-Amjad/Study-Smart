package com.example.dhbwstudysmartbackend.repository;

import com.example.dhbwstudysmartbackend.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
