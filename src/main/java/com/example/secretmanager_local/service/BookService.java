package com.example.secretmanager_local.service;

import com.example.secretmanager_local.model.Book;
import com.example.secretmanager_local.repository.BookRepository;
import java.util.List;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public List<Book> getBookList() {
    return StreamSupport.stream(bookRepository.findAll().spliterator(), false)
        .toList();
  }
}
