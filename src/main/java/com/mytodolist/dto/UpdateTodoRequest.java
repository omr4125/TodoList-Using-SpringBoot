package com.mytodolist.dto;

import org.springframework.stereotype.Component;

@Component
public class UpdateTodoRequest {

    private String title;
    private String todoText;
    private Boolean completed;

    public UpdateTodoRequest() {}

    public UpdateTodoRequest(String title, String todoText, Boolean completed) {
        this.title = title;
        this.todoText = todoText;
        this.completed = completed;
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

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
