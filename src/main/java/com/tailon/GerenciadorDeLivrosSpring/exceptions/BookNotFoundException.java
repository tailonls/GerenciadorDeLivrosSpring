package com.tailon.GerenciadorDeLivrosSpring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(Long id) {
        super("Livro com id " + id + " não encontrado!");
    }
}
