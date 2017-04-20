package com.nklkarthi.persistence.service;

import com.nklkarthi.persistence.dao.common.IAuditOperations;
import com.nklkarthi.persistence.model.Foo;

public interface IFooAuditableService extends IFooService, IAuditOperations<Foo> {
    //
}
