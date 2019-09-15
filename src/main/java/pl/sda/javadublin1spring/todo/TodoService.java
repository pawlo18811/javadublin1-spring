package pl.sda.javadublin1spring.todo;

import java.util.List;

public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo findById(Long id) {
        return null;
    }

    public List<Todo> findAll() {
        return null;
    }

    public List<Todo> findByStatus(TodoStatus status) {
        return null;
    }
}
