package com.nklkarthi.persistence.dao.impl;

import com.nklkarthi.persistence.dao.common.AbstractHibernateDao;
import com.nklkarthi.persistence.dao.IBarDao;
import com.nklkarthi.persistence.model.Bar;
import org.springframework.stereotype.Repository;

@Repository
public class BarDao extends AbstractHibernateDao<Bar> implements IBarDao {

    public BarDao() {
        super();

        setClazz(Bar.class);
    }

    // API

}
