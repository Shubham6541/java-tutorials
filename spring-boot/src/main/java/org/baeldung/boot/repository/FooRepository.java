package org.nklkarthi.boot.repository;

import org.nklkarthi.boot.model.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo, Integer> {
    public Foo findByName(String name);
}
