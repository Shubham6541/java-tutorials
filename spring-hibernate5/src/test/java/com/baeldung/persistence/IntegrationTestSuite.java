package com.nklkarthi.persistence;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.nklkarthi.persistence.audit.AuditTestSuite;
import com.nklkarthi.persistence.hibernate.FooPaginationPersistenceIntegrationTest;
import com.nklkarthi.persistence.hibernate.FooSortingPersistenceIntegrationTest;
import com.nklkarthi.persistence.service.FooServiceBasicPersistenceIntegrationTest;
import com.nklkarthi.persistence.service.FooServicePersistenceIntegrationTest;
import com.nklkarthi.persistence.service.ParentServicePersistenceIntegrationTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ // @formatter:off
    AuditTestSuite.class
    ,FooServiceBasicPersistenceIntegrationTest.class
    ,FooPaginationPersistenceIntegrationTest.class
    ,FooServicePersistenceIntegrationTest.class
    ,ParentServicePersistenceIntegrationTest.class
    ,FooSortingPersistenceIntegrationTest.class

}) // @formatter:on
public class IntegrationTestSuite {
    //
}
