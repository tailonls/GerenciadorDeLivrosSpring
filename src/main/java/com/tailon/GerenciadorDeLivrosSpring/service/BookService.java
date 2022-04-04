package com.tailon.GerenciadorDeLivrosSpring.service;

import com.tailon.GerenciadorDeLivrosSpring.dto.BookDTO;
import com.tailon.GerenciadorDeLivrosSpring.dto.MessageResponseDTO;
import com.tailon.GerenciadorDeLivrosSpring.entity.Book;
import com.tailon.GerenciadorDeLivrosSpring.exceptions.BookNotFoundException;
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
        try {
            Book bookToSave = bookMapper.toModel(bookDTO); // Convertendo DTO para Model

            Book savedBook = bookRepository.save(bookToSave); // Salvando no Banco de Dados
            return MessageResponseDTO.builder().message("Livro salvo com o ID " + savedBook.getId()).build();

        } catch (Exception e) {
            System.out.println("Erro ao criar livro: " + e.getMessage());
            return null;
        }
    }

    public BookDTO
    findById(Long id) throws BookNotFoundException {
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
        return bookMapper.toDTO(book);
    }
}
