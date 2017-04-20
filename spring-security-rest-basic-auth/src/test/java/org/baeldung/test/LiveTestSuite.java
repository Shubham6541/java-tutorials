package org.nklkarthi.test;

import org.nklkarthi.client.ClientLiveTest;
import org.nklkarthi.client.RestClientLiveManualTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
// @formatter:off
    RestClientLiveManualTest.class
    ,ClientLiveTest.class
}) //
public class LiveTestSuite {

}
