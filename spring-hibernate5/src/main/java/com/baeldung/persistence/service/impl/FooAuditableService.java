package com.nklkarthi.persistence.service.impl;

import com.nklkarthi.persistence.dao.common.IAuditOperations;
import com.nklkarthi.persistence.service.IFooAuditableService;
import com.nklkarthi.persistence.service.common.AbstractHibernateAuditableService;
import com.nklkarthi.persistence.dao.IFooAuditableDao;
import com.nklkarthi.persistence.dao.IFooDao;
import com.nklkarthi.persistence.dao.common.IOperations;
import com.nklkarthi.persistence.model.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooAuditableService extends AbstractHibernateAuditableService<Foo> implements IFooAuditableService {

    @Autowired
    @Qualifier("fooHibernateDao")
    private IFooDao dao;

    @Autowired
    @Qualifier("fooHibernateAuditableDao")
    private IFooAuditableDao auditDao;

    public FooAuditableService() {
        super();
    }

    // API

    @Override
    protected IOperations<Foo> getDao() {
        return dao;
    }

    @Override
    protected IAuditOperations<Foo> getAuditableDao() {
        return auditDao;
    }

}
