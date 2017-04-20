package com.nklkarthi.persistence.dao;

import com.nklkarthi.persistence.dao.common.IAuditOperations;
import com.nklkarthi.persistence.model.Bar;

public interface IBarAuditableDao extends IBarDao, IAuditOperations<Bar> {
    //
}
