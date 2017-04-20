package com.nklkarthi.persistence.service.impl;

import com.nklkarthi.persistence.dao.common.IAuditOperations;
import com.nklkarthi.persistence.service.common.AbstractHibernateAuditableService;
import com.nklkarthi.persistence.dao.IBarAuditableDao;
import com.nklkarthi.persistence.dao.IBarDao;
import com.nklkarthi.persistence.dao.common.IOperations;
import com.nklkarthi.persistence.model.Bar;
import com.nklkarthi.persistence.service.IBarAuditableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BarAuditableService extends AbstractHibernateAuditableService<Bar> implements IBarAuditableService {

    @Autowired
    @Qualifier("barHibernateDao")
    private IBarDao dao;

    @Autowired
    @Qualifier("barHibernateAuditableDao")
    private IBarAuditableDao auditDao;

    public BarAuditableService() {
        super();
    }

    // API

    @Override
    protected IOperations<Bar> getDao() {
        return dao;
    }

    @Override
    protected IAuditOperations<Bar> getAuditableDao() {
        return auditDao;
    }

}
