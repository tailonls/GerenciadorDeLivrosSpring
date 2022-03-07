package com.tailon.GerenciadorDeLivrosSpring.controller;

import com.tailon.GerenciadorDeLivrosSpring.service.BookService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {

    private MockMvc mockMvc;

    @Mock // Indica que se trata de um mock e será utilizado para simular as chamadas
    private BookService bookService;

    @InjectMocks // Sempre que instanciar esse controller irá injetar o service
    private BookController bookController;

//    @BeforeEach
//    void setup(){
//        mockMvc = MockMvcBuilders.standaloneSetup(bookController)
//                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver()
//                        .setvi);
//    }

}