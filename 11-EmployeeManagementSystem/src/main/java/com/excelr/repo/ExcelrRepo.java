package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Employee;

@Repository
public interface ExcelrRepo extends JpaRepository<Employee, Integer> {

}
