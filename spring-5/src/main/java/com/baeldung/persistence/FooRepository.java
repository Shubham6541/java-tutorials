package com.nklkarthi.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.nklkarthi.web.Foo;

public interface FooRepository extends JpaRepository<Foo, Long>, JpaSpecificationExecutor<Foo> {

}
