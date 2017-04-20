package org.nklkarthi;

import org.nklkarthi.persistence.PersistenceTestSuite;
import org.nklkarthi.security.SecurityTestSuite;
import org.nklkarthi.web.LiveTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
// @formatter:off
    PersistenceTestSuite.class
    ,SecurityTestSuite.class
    ,LiveTestSuite.class
}) //
public class TestSuite {

}
