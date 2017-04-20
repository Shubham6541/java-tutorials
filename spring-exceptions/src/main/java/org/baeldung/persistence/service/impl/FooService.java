package org.nklkarthi.persistence.service.impl;

import org.nklkarthi.persistence.common.AbstractService;
import org.nklkarthi.persistence.common.IOperations;
import org.nklkarthi.persistence.dao.IFooDao;
import org.nklkarthi.persistence.model.Foo;
import org.nklkarthi.persistence.service.IFooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService extends AbstractService<Foo> implements IFooService {

    @Autowired
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
