package org.nklkarthi.persistence.dao.impl;

import org.nklkarthi.persistence.common.AbstractHibernateDao;
import org.nklkarthi.persistence.dao.IFooDao;
import org.nklkarthi.persistence.model.Foo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FooDao extends AbstractHibernateDao<Foo> implements IFooDao {

    @Autowired
    private SessionFactory sessionFactory;

    public FooDao() {
        super();

        setClazz(Foo.class);
    }

    // API

}
