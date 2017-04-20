package com.nklkarthi.persistence.dao.impl;

import com.nklkarthi.persistence.dao.IParentDao;
import com.nklkarthi.persistence.dao.common.AbstractHibernateDao;
import com.nklkarthi.persistence.model.Parent;
import org.springframework.stereotype.Repository;

@Repository
public class ParentDao extends AbstractHibernateDao<Parent> implements IParentDao {

    public ParentDao() {
        super();

        setClazz(Parent.class);
    }

    // API

}
