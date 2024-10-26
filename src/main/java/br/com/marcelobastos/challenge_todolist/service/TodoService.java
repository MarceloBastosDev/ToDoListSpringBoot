package br.com.marcelobastos.challenge_todolist.service;

import br.com.marcelobastos.challenge_todolist.entity.Todo;
import br.com.marcelobastos.challenge_todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    //CREATE
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }
    //READ
    public List<Todo> list(){
        Sort sort = Sort.by("prioriedade").descending().and(
                Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }
    //UPDATE
    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }
    //DELETE
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }

}
