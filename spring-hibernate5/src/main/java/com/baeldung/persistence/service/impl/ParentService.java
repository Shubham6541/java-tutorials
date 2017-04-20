package com.nklkarthi.persistence.service.impl;

import com.nklkarthi.persistence.model.Parent;
import com.nklkarthi.persistence.service.IParentService;
import com.nklkarthi.persistence.dao.IParentDao;
import com.nklkarthi.persistence.dao.common.IOperations;
import com.nklkarthi.persistence.service.common.AbstractHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService extends AbstractHibernateService<Parent> implements IParentService {

    @Autowired
    private IParentDao dao;

    public ParentService() {
        super();
    }

    // API

    @Override
    protected IOperations<Parent> getDao() {
        return dao;
    }

}
