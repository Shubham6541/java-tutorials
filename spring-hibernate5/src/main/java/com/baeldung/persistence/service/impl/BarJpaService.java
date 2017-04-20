package com.nklkarthi.persistence.service.impl;

import com.nklkarthi.persistence.dao.IBarDao;
import com.nklkarthi.persistence.dao.common.IOperations;
import com.nklkarthi.persistence.model.Bar;
import com.nklkarthi.persistence.service.IBarService;
import com.nklkarthi.persistence.service.common.AbstractJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BarJpaService extends AbstractJpaService<Bar> implements IBarService {

    @Autowired
    @Qualifier("barJpaDao")
    private IBarDao dao;

    public BarJpaService() {
        super();
    }

    // API

    @Override
    protected IOperations<Bar> getDao() {
        return dao;
    }

}