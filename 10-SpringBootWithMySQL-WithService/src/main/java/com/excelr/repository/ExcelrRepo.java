package com.excelr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Products;

@Repository
public interface ExcelrRepo extends JpaRepository<Products, Integer> {

}
