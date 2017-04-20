
package com.nklkarthi.examples.guice;

import com.nklkarthi.examples.guice.constant.CommunicationModel;

public interface CommunicationMode {

    public CommunicationModel getMode();
    
    public boolean sendMessage(String message);

}
