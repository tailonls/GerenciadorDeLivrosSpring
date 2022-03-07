package com.tailon.GerenciadorDeLivrosSpring.service;

import com.tailon.GerenciadorDeLivrosSpring.dto.BookDTO;
import com.tailon.GerenciadorDeLivrosSpring.dto.MessageResponseDTO;
import com.tailon.GerenciadorDeLivrosSpring.entity.Book;
import com.tailon.GerenciadorDeLivrosSpring.mapper.BookMapper;
import com.tailon.GerenciadorDeLivrosSpring.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;
    private final BookMapper bookMapper = BookMapper.INSTANCE;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO); // Convertendo DTO para Model
        Book savedBook = bookRepository.save(bookToSave); // Salvando no Banco de Dados

        return MessageResponseDTO.builder().message("Livro salvo com o ID " + savedBook.getId()).build();
    }
}
