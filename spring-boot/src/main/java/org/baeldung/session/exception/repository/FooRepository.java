package org.nklkarthi.session.exception.repository;

import org.nklkarthi.boot.model.Foo;

public interface FooRepository {

    void save(Foo foo);

    Foo get(Integer id);
}
