package com.nklkarthi.ejb.setup.test;

import com.nklkarthi.ejb.client.EJBClient;
import com.nklkarthi.ejb.tutorial.HelloWorldBean;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EJBSetupTest {

    @Test
    public void EJBClientTest() {
        EJBClient ejbClient = new EJBClient();
        HelloWorldBean bean = new HelloWorldBean();
        assertEquals(bean.getHelloWorld(), ejbClient.getEJBRemoteMessage());
    }

}
