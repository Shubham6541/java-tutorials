package com.nklkarthi.service;

import com.nklkarthi.interceptor.Audited;

public class SuperService {
    @Audited
    public String deliverService(String uid) {
        return uid;
    }
}
