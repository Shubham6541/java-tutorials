package org.nklkarthi.persistence.dao.impl;

import org.nklkarthi.persistence.common.AbstractHibernateDao;
import org.nklkarthi.persistence.dao.IChildDao;
import org.nklkarthi.persistence.model.Child;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChildDao extends AbstractHibernateDao<Child> implements IChildDao {

    @Autowired
    private SessionFactory sessionFactory;

    public ChildDao() {
        super();

        setClazz(Child.class);
    }

    // API

}
