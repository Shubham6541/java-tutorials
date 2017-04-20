package org.nklkarthi.persistence;

import org.nklkarthi.persistence.query.JPACriteriaQueryIntegrationTest;
import org.nklkarthi.persistence.query.JPAQuerydslIntegrationTest;
import org.nklkarthi.persistence.query.JPASpecificationIntegrationTest;
import org.nklkarthi.persistence.query.RsqlIntegrationTest;
import org.nklkarthi.persistence.service.FooServicePersistenceIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    // @formatter:off
    RsqlIntegrationTest.class
    ,JPASpecificationIntegrationTest.class
    ,FooServicePersistenceIntegrationTest.class
    ,JPAQuerydslIntegrationTest.class
    ,JPACriteriaQueryIntegrationTest.class
}) //
public class PersistenceTestSuite {

}
