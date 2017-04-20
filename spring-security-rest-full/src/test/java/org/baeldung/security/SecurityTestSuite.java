package org.nklkarthi.security;

import org.nklkarthi.security.csrf.CsrfDisabledIntegrationTest;
import org.nklkarthi.security.csrf.CsrfEnabledIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    // @formatter:off
    CsrfEnabledIntegrationTest.class
    ,CsrfDisabledIntegrationTest.class
}) //
public class SecurityTestSuite {

}
