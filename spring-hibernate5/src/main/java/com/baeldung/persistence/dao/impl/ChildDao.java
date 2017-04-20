package com.nklkarthi.persistence.dao.impl;

import com.nklkarthi.persistence.dao.common.AbstractHibernateDao;
import com.nklkarthi.persistence.model.Child;
import com.nklkarthi.persistence.dao.IChildDao;
import org.springframework.stereotype.Repository;

@Repository
public class ChildDao extends AbstractHibernateDao<Child> implements IChildDao {

    public ChildDao() {
        super();

        setClazz(Child.class);
    }

    // API

}
