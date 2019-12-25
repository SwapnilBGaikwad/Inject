package app;

import reflection.Framework;

public class Main {
    public static void main(String[] args) throws Exception {
        Framework framework = new Framework(Main.class);
        Student student = framework.get(Student.class);
        System.out.println(student.getName());
        System.out.println(student.getExam().getMarks());
    }
}
