package com.mytodolist.dto;

import org.springframework.stereotype.Component;

@Component
public class CreateTodoRequest {

    private String title;
    private String todoText;

    public CreateTodoRequest() {}

    public CreateTodoRequest(String title, String todoText) {
        this.title = title;
        this.todoText = todoText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTodoText() {
        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }
}
