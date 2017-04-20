package com.nklkarthi.persistence.service.impl;

import com.nklkarthi.persistence.model.Child;
import com.nklkarthi.persistence.service.IChildService;
import com.nklkarthi.persistence.dao.IChildDao;
import com.nklkarthi.persistence.dao.common.IOperations;
import com.nklkarthi.persistence.service.common.AbstractHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildService extends AbstractHibernateService<Child> implements IChildService {

    @Autowired
    private IChildDao dao;

    public ChildService() {
        super();
    }

    // API

    @Override
    protected IOperations<Child> getDao() {
        return dao;
    }

}
