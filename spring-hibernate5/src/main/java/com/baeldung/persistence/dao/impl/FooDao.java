package com.nklkarthi.persistence.dao.impl;

import com.nklkarthi.persistence.dao.common.AbstractHibernateDao;
import com.nklkarthi.persistence.dao.IFooDao;
import com.nklkarthi.persistence.model.Foo;
import org.springframework.stereotype.Repository;

@Repository
public class FooDao extends AbstractHibernateDao<Foo> implements IFooDao {

    public FooDao() {
        super();

        setClazz(Foo.class);
    }

    // API

}
