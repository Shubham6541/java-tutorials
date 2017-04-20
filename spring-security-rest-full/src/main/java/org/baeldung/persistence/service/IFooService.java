package org.nklkarthi.persistence.service;

import org.nklkarthi.persistence.IOperations;
import org.nklkarthi.persistence.model.Foo;

public interface IFooService extends IOperations<Foo> {

    Foo retrieveByName(String name);

}
