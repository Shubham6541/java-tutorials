package com.nklkarthi.persistence.dao.impl;

import com.nklkarthi.persistence.dao.common.AbstractHibernateAuditableDao;
import com.nklkarthi.persistence.model.Foo;
import com.nklkarthi.persistence.dao.IFooAuditableDao;

public class FooAuditableDao extends AbstractHibernateAuditableDao<Foo> implements IFooAuditableDao {

    public FooAuditableDao() {
        super();

        setClazz(Foo.class);
    }

    // API

}
