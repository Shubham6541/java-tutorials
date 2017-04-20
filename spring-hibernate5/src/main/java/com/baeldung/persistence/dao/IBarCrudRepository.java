package com.nklkarthi.persistence.dao;

import java.io.Serializable;

import com.nklkarthi.persistence.model.Bar;
import org.springframework.data.repository.CrudRepository;

public interface IBarCrudRepository extends CrudRepository<Bar, Serializable> {
    //
}
