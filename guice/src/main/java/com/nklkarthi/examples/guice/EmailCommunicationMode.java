
package com.nklkarthi.examples.guice;

import com.nklkarthi.examples.guice.aop.MessageSentLoggable;
import com.nklkarthi.examples.guice.constant.CommunicationModel;

/**
 *
 * @author nklkarthi
 */
public class EmailCommunicationMode implements CommunicationMode {

    @Override
    public CommunicationModel getMode() {
        return CommunicationModel.EMAIL;
    }

    @Override
    @MessageSentLoggable
    public boolean sendMessage(String Message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
