package org.nklkarthi.persistence.dao;

import org.nklkarthi.persistence.model.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFooDao extends JpaRepository<Foo, Long>, JpaSpecificationExecutor<Foo> {

    @Query("SELECT f FROM Foo f WHERE LOWER(f.name) = LOWER(:name)")
    Foo retrieveByName(@Param("name") String name);

}
