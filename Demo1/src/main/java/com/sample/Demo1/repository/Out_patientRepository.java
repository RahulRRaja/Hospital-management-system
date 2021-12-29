package com.sample.Demo1.repository;

import com.sample.Demo1.entity.Out_patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Out_patientRepository extends JpaRepository<Out_patient,Integer> {
}
