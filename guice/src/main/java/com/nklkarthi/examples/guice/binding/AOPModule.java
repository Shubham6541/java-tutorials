
package com.nklkarthi.examples.guice.binding;

import com.nklkarthi.examples.guice.aop.MessageLogger;
import com.nklkarthi.examples.guice.aop.MessageSentLoggable;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 *
 * @author nklkarthi
 */
public class AOPModule extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(),
                Matchers.annotatedWith(MessageSentLoggable.class),
                new MessageLogger()
        );
    }

}
