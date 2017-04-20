package com.nklkarthi.cxf.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentLiveTest {
    private ApplicationContext context = new AnnotationConfigApplicationContext(ClientConfiguration.class);
    private nklkarthi nklkarthiProxy = (nklkarthi) context.getBean("client");

    @Test
    public void whenUsingHelloMethod_thenCorrect() {
        String response = nklkarthiProxy.hello("John Doe");
        assertEquals("Hello John Doe!", response);
    }

    @Test
    public void whenUsingRegisterMethod_thenCorrect() {
        Student student1 = new Student("Adam");
        Student student2 = new Student("Eve");
        String student1Response = nklkarthiProxy.register(student1);
        String student2Response = nklkarthiProxy.register(student2);

        assertEquals("Adam is registered student number 1", student1Response);
        assertEquals("Eve is registered student number 2", student2Response);
    }
}