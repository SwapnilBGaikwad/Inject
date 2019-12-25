package com.github.reflection.object;

import com.github.reflection.Autowired;
import com.github.reflection.Component;

@Component
public class Exam {
    private Integer marks;

    @Autowired
    public Exam(Integer marks) {
        this.marks = marks;
    }

    public Integer getMarks() {
        return marks;
    }
}
