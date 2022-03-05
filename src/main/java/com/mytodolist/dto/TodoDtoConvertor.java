package com.mytodolist.dto;

import com.mytodolist.model.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoDtoConvertor {

    public TodoDto convert(Todo from){
        return new TodoDto(from.getTitle(), from.getTodoText(), from.getCompleted());
    }
}
