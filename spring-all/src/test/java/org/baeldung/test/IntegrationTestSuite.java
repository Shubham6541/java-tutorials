package org.nklkarthi.test;

import org.nklkarthi.properties.basic.ExtendedPropertiesWithJavaIntegrationTest;
import org.nklkarthi.properties.basic.PropertiesWithMultipleXmlsIntegrationTest;
import org.nklkarthi.properties.basic.PropertiesWithXmlIntegrationTest;
import org.nklkarthi.properties.external.ExternalPropertiesWithJavaIntegrationTest;
import org.nklkarthi.properties.external.ExternalPropertiesWithMultipleXmlsIntegrationTest;
import org.nklkarthi.properties.external.ExternalPropertiesWithXmlManualTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ //@formatter:off
    PropertiesWithXmlIntegrationTest.class,
    ExternalPropertiesWithJavaIntegrationTest.class,
    ExternalPropertiesWithMultipleXmlsIntegrationTest.class,
    ExternalPropertiesWithXmlManualTest.class,
    ExtendedPropertiesWithJavaIntegrationTest.class,
    PropertiesWithMultipleXmlsIntegrationTest.class,
})// @formatter:on
public final class IntegrationTestSuite {
    //
}
