package com.mytodolist.service;

import com.mytodolist.dto.CreateTodoRequest;
import com.mytodolist.dto.TodoDto;
import com.mytodolist.dto.TodoDtoConvertor;
import com.mytodolist.dto.UpdateTodoRequest;
import com.mytodolist.exception.TodoNotFoundException;
import com.mytodolist.model.Todo;
import com.mytodolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private final TodoRepository todoRepository;
    private final TodoDtoConvertor dtoConvertor;

    public TodoService(TodoRepository todoRepository, TodoDtoConvertor dtoConvertor) {
        this.todoRepository = todoRepository;
        this.dtoConvertor = dtoConvertor;
    }

    public List<TodoDto> getAllTodos() {
        return todoRepository.findAll().stream()
                                        .map(dtoConvertor::convert)
                                        .collect(Collectors.toList());
    }

    public TodoDto createTodo(final CreateTodoRequest createTodoRequest) {
        Todo todo = new Todo(createTodoRequest.getTitle(), createTodoRequest.getTodoText(), false);
        return dtoConvertor.convert(todoRepository.save(todo));
    }

    public TodoDto getTodoById(Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow(() -> new TodoNotFoundException("Todo could not be found" + id));
        return dtoConvertor.convert(todo);
    }

    public TodoDto updateTodo(Long id, UpdateTodoRequest updateTodoRequest) {
        Todo todo = todoRepository.findById(id).orElseThrow(() -> new TodoNotFoundException("Todo could not be found" + id));
        System.out.println(todo);
        Todo updatedTodo = new Todo(todo.getId(),
                updateTodoRequest.getTitle(),
                updateTodoRequest.getTodoText(),
                updateTodoRequest.getCompleted());
        return dtoConvertor.convert(todoRepository.save(updatedTodo));
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
