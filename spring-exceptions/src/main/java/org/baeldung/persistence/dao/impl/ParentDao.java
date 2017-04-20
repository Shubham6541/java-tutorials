package org.nklkarthi.persistence.dao.impl;

import org.nklkarthi.persistence.common.AbstractHibernateDao;
import org.nklkarthi.persistence.dao.IParentDao;
import org.nklkarthi.persistence.model.Parent;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ParentDao extends AbstractHibernateDao<Parent> implements IParentDao {

    @Autowired
    private SessionFactory sessionFactory;

    public ParentDao() {
        super();

        setClazz(Parent.class);
    }

    // API

}
