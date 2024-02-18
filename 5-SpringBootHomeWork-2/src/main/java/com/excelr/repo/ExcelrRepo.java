package com.excelr.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Book;

@Repository
public interface ExcelrRepo extends CrudRepository<Book, Integer> {

}
