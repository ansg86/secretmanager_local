package com.example.secretmanager_local.controller;

import com.example.secretmanager_local.model.Book;
import com.example.secretmanager_local.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  @Autowired
  private BookService bookService;

  @GetMapping("/books")
  public List<Book> getBookList() {
    return bookService.getBookList();
  }
}
