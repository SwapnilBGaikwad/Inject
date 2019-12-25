package com.github.reflection.object;

import com.github.reflection.Autowired;
import com.github.reflection.Component;

@Component
public class Student {
    private String name;
    private Exam exam;

    @Autowired
    public Student(String name, Exam exam) {
        this.name = name;
        this.exam = exam;
    }

    public String getName() {
        return name;
    }

    public Exam getExam() {
        return exam;
    }
}
