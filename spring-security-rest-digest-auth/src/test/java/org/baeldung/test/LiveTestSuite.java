package org.nklkarthi.test;

import org.nklkarthi.client.ClientNoSpringLiveTest;
import org.nklkarthi.client.ClientWithSpringLiveTest;
import org.nklkarthi.client.RawClientLiveTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
// @formatter:off
    RawClientLiveTest.class
    ,ClientWithSpringLiveTest.class
    ,ClientNoSpringLiveTest.class
}) //
public class LiveTestSuite {

}
