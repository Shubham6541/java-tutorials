package com.nklkarthi.persistence.service.impl;

import java.io.Serializable;

import com.nklkarthi.persistence.service.common.AbstractSpringDataJpaService;
import com.nklkarthi.persistence.dao.IBarCrudRepository;
import com.nklkarthi.persistence.model.Bar;
import com.nklkarthi.persistence.service.IBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class BarSpringDataJpaService extends AbstractSpringDataJpaService<Bar> implements IBarService {

    @Autowired
    private IBarCrudRepository dao;

    public BarSpringDataJpaService() {
        super();
    }

    @Override
    protected CrudRepository<Bar, Serializable> getDao() {
        return dao;
    }

}
