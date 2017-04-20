package org.nklkarthi.ex.nosuchbeandefinitionexception;

import org.nklkarthi.ex.nosuchbeandefinitionexception.spring.Cause1ContextWithJavaConfig;
import org.nklkarthi.persistence.model.Child;
import org.nklkarthi.persistence.model.Parent;
import org.nklkarthi.persistence.service.IChildService;
import org.nklkarthi.persistence.service.IParentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Cause1ContextWithJavaConfig.class }, loader = AnnotationConfigContextLoader.class)
public class Cause1NoSuchBeanDefinitionExceptionManualTest {

    @Test
    public final void givenContextIsInitialized_thenNoException() {
        //
    }

}
