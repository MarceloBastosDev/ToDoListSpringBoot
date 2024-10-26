package br.com.marcelobastos.challenge_todolist.repository;

import br.com.marcelobastos.challenge_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {



}
