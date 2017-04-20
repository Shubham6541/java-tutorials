package com.nklkarthi.persistence.dao;

import com.nklkarthi.persistence.dao.common.IAuditOperations;
import com.nklkarthi.persistence.model.Foo;

public interface IFooAuditableDao extends IFooDao, IAuditOperations<Foo> {
    //
}