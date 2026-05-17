package br.com.leonardosimao.pratica_todolist;

import br.com.leonardosimao.pratica_todolist.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class TodoControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testeCreateTodoSuccess() {

        Todo todo = new Todo();
        todo.setNome("todo 1");
        todo.setDescricao("desc todo 1");
        todo.setRealizado(false);
        todo.setPrioridade(1);

        webTestClient
                .post()
                .uri("/todos")
                .bodyValue(todo)
                .exchange()
                .expectStatus().isOk();
    }
}