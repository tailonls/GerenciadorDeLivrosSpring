package com.tailon.GerenciadorDeLivrosSpring.mapper;

import com.tailon.GerenciadorDeLivrosSpring.dto.BookDTO;
import com.tailon.GerenciadorDeLivrosSpring.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper { // Classe que faz o mapeamento dos atributos para converção de Model/DTO

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
