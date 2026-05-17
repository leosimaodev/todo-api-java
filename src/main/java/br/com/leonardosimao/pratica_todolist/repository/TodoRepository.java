package br.com.leonardosimao.pratica_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leonardosimao.pratica_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository <Todo, Long> {
    
}
