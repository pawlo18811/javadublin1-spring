package pl.sda.javadublin1spring.todo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TodoServiceTest {
    private TodoService todoService;

    @Before
    public void init() {
        this.todoService = new TodoService(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findById_ShouldThrowIllegalArgumentExceptionWhenPassingNull() {
        // given
        Long id = null;

        // when
        todoService.findById(id);

        // then
        // exception is thrown
    }

    @Test(expected = IllegalArgumentException.class)
    public void findById_ShouldThrowIllegalArgumentExceptionWhenPassingNonPositiveValue() {
        // given
        Long id = -5L;

        //when
        todoService.findById(id);
    }

    @Test(expected = TodoNotFoundException.class)
    public void findById_ShouldThrowTodoNotFoundExceptionWhenPassingNonExistingId() {
        // given
        Long id = 10L;

        // when
        todoService.findById(id);
    }

    @Test
    public void findById_ShouldReturnExpectedTodoForExistingId() {
        // given
        Long id = 3L;
        Todo expectedTodo = new Todo(3L, "ugotowac obiad", "Lorem ipsum", TodoStatus.NEW);

        // when
        Todo actual = todoService.findById(id);

        // then
        Assert.assertEquals(expectedTodo, actual);
    }
}
