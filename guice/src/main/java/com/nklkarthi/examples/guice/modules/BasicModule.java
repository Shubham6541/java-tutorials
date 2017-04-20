
package com.nklkarthi.examples.guice.modules;

import com.nklkarthi.examples.guice.Communication;
import com.nklkarthi.examples.guice.CommunicationMode;
import com.nklkarthi.examples.guice.DefaultCommunicator;
import com.nklkarthi.examples.guice.EmailCommunicationMode;
import com.nklkarthi.examples.guice.IMCommunicationMode;
import com.nklkarthi.examples.guice.SMSCommunicationMode;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nklkarthi
 */
public class BasicModule extends AbstractModule {

    @Override
    protected void configure() {
        try {
            bind(Communication.class).toConstructor(Communication.class.getConstructor(Boolean.class));
            bind(Boolean.class).toInstance(true);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(com.nklkarthi.examples.guice.binding.BasicModule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(com.nklkarthi.examples.guice.binding.BasicModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        bind(DefaultCommunicator.class).annotatedWith(Names.named("AnotherCommunicator")).to(DefaultCommunicator.class).asEagerSingleton();

        bind(CommunicationMode.class).annotatedWith(Names.named("IMComms")).to(IMCommunicationMode.class);
        bind(CommunicationMode.class).annotatedWith(Names.named("EmailComms")).to(EmailCommunicationMode.class);
        bind(CommunicationMode.class).annotatedWith(Names.named("SMSComms")).to(SMSCommunicationMode.class);
    }

}
