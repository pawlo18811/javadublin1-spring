package pl.sda.javadublin1spring.todo;

import java.util.List;
import java.util.Optional;

public class InMemoryTodoRepository implements TodoRepository {
    @Override
    public List<Todo> findAll() {
        return null;
    }

    @Override
    public Optional<Todo> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Todo> findByStatus(TodoStatus status) {
        return null;
    }
}
