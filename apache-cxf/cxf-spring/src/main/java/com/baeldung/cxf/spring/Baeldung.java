package com.nklkarthi.cxf.spring;

import javax.jws.WebService;

@WebService
public interface nklkarthi {
    String hello(String name);

    String register(Student student);
}