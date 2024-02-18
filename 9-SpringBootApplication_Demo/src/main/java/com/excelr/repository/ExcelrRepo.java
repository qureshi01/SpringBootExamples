package com.excelr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelr.entity.Employees;

@Repository
public interface ExcelrRepo extends CrudRepository<Employees, Integer> {

}
