
package com.nklkarthi.examples.guice;

import com.nklkarthi.examples.guice.aop.MessageSentLoggable;
import com.nklkarthi.examples.guice.constant.CommunicationModel;
import com.google.inject.Inject;
import java.util.logging.Logger;

/**
 *
 * @author nklkarthi
 */
public class IMCommunicationMode implements CommunicationMode {

    @Inject
    private Logger logger;

    @Override
    public CommunicationModel getMode() {
        return CommunicationModel.IM;
    }

    @Override
    @MessageSentLoggable
    public boolean sendMessage(String message) {
        logger.info("IM Message Sent");
        return true;
    }

}
