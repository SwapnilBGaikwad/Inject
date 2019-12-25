package com.github.reflection.object;

import com.github.reflection.Framework;
import org.junit.Assert;
import org.junit.Test;

public class CustomObjectTest {
    @Test
    public void testStudentInitialisationTest() throws Exception {
        Framework framework = new Framework(CustomObjectTest.class);
        Student student = framework.get(Student.class);
        Assert.assertEquals(100, student.getExam().getMarks().intValue());
        Assert.assertEquals("String value", student.getName());
    }
}
