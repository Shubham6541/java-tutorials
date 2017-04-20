package com.nklkarthi.cxf.introduction;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.junit.Before;
import org.junit.Test;

public class StudentLiveTest {
    private static QName SERVICE_NAME = new QName("http://introduction.cxf.nklkarthi.com/", "nklkarthi");
    private static QName PORT_NAME = new QName("http://introduction.cxf.nklkarthi.com/", "nklkarthiPort");

    private Service service;
    private nklkarthi nklkarthiProxy;
    private nklkarthiImpl nklkarthiImpl;

    {
        service = Service.create(SERVICE_NAME);
        final String endpointAddress = "http://localhost:8080/nklkarthi";
        service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, endpointAddress);
    }

    @Before
    public void reinstantiatenklkarthiInstances() {
        nklkarthiImpl = new nklkarthiImpl();
        nklkarthiProxy = service.getPort(PORT_NAME, nklkarthi.class);
    }

    @Test
    public void whenUsingHelloMethod_thenCorrect() {
        final String endpointResponse = nklkarthiProxy.hello("nklkarthi");
        final String localResponse = nklkarthiImpl.hello("nklkarthi");
        assertEquals(localResponse, endpointResponse);
    }

    @Test
    public void whenUsingHelloStudentMethod_thenCorrect() {
        final Student student = new StudentImpl("John Doe");
        final String endpointResponse = nklkarthiProxy.helloStudent(student);
        final String localResponse = nklkarthiImpl.helloStudent(student);
        assertEquals(localResponse, endpointResponse);
    }

    @Test
    public void usingGetStudentsMethod_thenCorrect() {
        final Student student1 = new StudentImpl("Adam");
        nklkarthiProxy.helloStudent(student1);

        final Student student2 = new StudentImpl("Eve");
        nklkarthiProxy.helloStudent(student2);

        final Map<Integer, Student> students = nklkarthiProxy.getStudents();
        assertEquals("Adam", students.get(1).getName());
        assertEquals("Eve", students.get(2).getName());
    }
}