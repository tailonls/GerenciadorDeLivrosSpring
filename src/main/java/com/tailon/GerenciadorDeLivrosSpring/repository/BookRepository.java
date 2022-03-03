package com.tailon.GerenciadorDeLivrosSpring.repository;

import com.tailon.GerenciadorDeLivrosSpring.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
