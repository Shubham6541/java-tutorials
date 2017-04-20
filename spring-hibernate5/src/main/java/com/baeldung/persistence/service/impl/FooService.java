package com.nklkarthi.persistence.service.impl;

import com.nklkarthi.persistence.dao.IFooDao;
import com.nklkarthi.persistence.dao.common.IOperations;
import com.nklkarthi.persistence.model.Foo;
import com.nklkarthi.persistence.service.IFooService;
import com.nklkarthi.persistence.service.common.AbstractHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooService extends AbstractHibernateService<Foo> implements IFooService {

    @Autowired
    @Qualifier("fooHibernateDao")
    private IFooDao dao;

    public FooService() {
        super();
    }

    // API

    @Override
    protected IOperations<Foo> getDao() {
        return dao;
    }

}
