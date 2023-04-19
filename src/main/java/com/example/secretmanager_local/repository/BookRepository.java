package com.example.secretmanager_local.repository;

import com.example.secretmanager_local.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {

}
