package org.nklkarthi.persistence.service.impl;

import org.nklkarthi.persistence.common.AbstractService;
import org.nklkarthi.persistence.common.IOperations;
import org.nklkarthi.persistence.dao.IChildDao;
import org.nklkarthi.persistence.model.Child;
import org.nklkarthi.persistence.service.IChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildService extends AbstractService<Child> implements IChildService {

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
