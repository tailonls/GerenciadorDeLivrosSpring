package com.tailon.GerenciadorDeLivrosSpring.controller;

import com.tailon.GerenciadorDeLivrosSpring.dto.BookDTO;
import com.tailon.GerenciadorDeLivrosSpring.dto.MessageResponseDTO;
import com.tailon.GerenciadorDeLivrosSpring.exceptions.BookNotFoundException;
import com.tailon.GerenciadorDeLivrosSpring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
        return bookService.create(bookDTO);
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) throws BookNotFoundException {
        return bookService.findById(id);
    }
}
