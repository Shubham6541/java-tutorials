package org.nklkarthi.persistence.service.impl;

import org.nklkarthi.persistence.common.AbstractService;
import org.nklkarthi.persistence.common.IOperations;
import org.nklkarthi.persistence.dao.IParentDao;
import org.nklkarthi.persistence.model.Parent;
import org.nklkarthi.persistence.service.IParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService extends AbstractService<Parent> implements IParentService {

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
