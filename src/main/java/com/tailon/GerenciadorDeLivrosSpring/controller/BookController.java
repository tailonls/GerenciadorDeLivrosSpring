package com.tailon.GerenciadorDeLivrosSpring.controller;

import com.tailon.GerenciadorDeLivrosSpring.dto.BookDTO;
import com.tailon.GerenciadorDeLivrosSpring.dto.MessageResponseDTO;
import com.tailon.GerenciadorDeLivrosSpring.service.BookService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create( @RequestBody @Valid BookDTO bookDTO) {
        return bookService.create(bookDTO);
    }
}
