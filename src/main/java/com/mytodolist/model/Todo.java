package com.mytodolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String todoText;
    private Boolean completed;

    public Todo() {}

    public Todo(Long id, String title, String todoText, Boolean completed) {
        this.id = id;
        this.title = title;
        this.todoText = todoText;
        this.completed = completed;
    }

    public Todo(String title, String todoText, Boolean completed) {
        this.title = title;
        this.todoText = todoText;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", todoText='" + todoText + '\'' +
                ", completed=" + completed +
                '}';
    }
}
