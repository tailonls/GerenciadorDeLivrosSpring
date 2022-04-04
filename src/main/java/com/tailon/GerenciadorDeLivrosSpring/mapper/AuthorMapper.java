package com.tailon.GerenciadorDeLivrosSpring.mapper;

import com.tailon.GerenciadorDeLivrosSpring.dto.AuthorDTO;
import com.tailon.GerenciadorDeLivrosSpring.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper { // Classe que faz o mapeamento dos atributos para converção de Model/DTO

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);
}
