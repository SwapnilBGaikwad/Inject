package app;

import reflection.Autowired;
import reflection.Component;

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
