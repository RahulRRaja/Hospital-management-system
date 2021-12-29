package com.sample.Demo1.repository;

import com.sample.Demo1.entity.Lab_report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Lab_reportRepository extends JpaRepository<Lab_report,Integer> {
}
