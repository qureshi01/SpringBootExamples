package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Product;

@Repository
public interface ExcelRRepo extends JpaRepository<Product, Long> {

}
