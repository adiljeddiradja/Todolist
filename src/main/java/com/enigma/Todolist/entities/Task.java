package com.enigma.Todolist.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "m_task")

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "task_seq")
    @SequenceGenerator(name = "task_seq",sequenceName = "m_task_id_seq",allocationSize = 1)

    private Integer id;
    @Column(name = "task",nullable = false)
    private String task;

    public Task(Integer id, String task) {
        this.id = id;
        this.task = task;
    }

    public Task() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}




