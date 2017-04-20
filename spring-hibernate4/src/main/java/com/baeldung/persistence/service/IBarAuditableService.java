package com.nklkarthi.persistence.service;

import com.nklkarthi.persistence.dao.common.IAuditOperations;
import com.nklkarthi.persistence.model.Bar;

public interface IBarAuditableService extends IBarService, IAuditOperations<Bar> {

}
