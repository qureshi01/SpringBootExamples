package com.excelr.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.mobile;

@Repository
public interface ExcelrRepo extends CrudRepository<mobile, Integer> {

}
