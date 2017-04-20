package com.nklkarthi.test;

import com.nklkarthi.initializer.SimpleXstreamInitializer;
import com.nklkarthi.pojo.ContactDetails;
import com.nklkarthi.pojo.Customer;
import com.nklkarthi.utility.SimpleDataGeneration;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class XStreamJsonHierarchicalTest {

    private Customer customer = null;
    private String dataJson = null;
    private XStream xstream = null;

    @Before
    public void dataSetup() {
        SimpleXstreamInitializer simpleXstreamInitializer = new SimpleXstreamInitializer();
        xstream = simpleXstreamInitializer.getXstreamJsonHierarchicalInstance();
        xstream.processAnnotations(Customer.class);
    }

    @Test
    public void convertObjectToJson() {
        customer = SimpleDataGeneration.generateData();
        xstream.alias("customer", Customer.class);
        xstream.alias("contactDetails", ContactDetails.class);
        xstream.aliasField("fn", Customer.class, "firstName");
        dataJson = xstream.toXML(customer);
        System.out.println(dataJson);
        Assert.assertNotNull(dataJson);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void convertJsonToObject() {
        customer = SimpleDataGeneration.generateData();
        dataJson = xstream.toXML(customer);
        customer = (Customer) xstream.fromXML(dataJson);
        Assert.assertNotNull(customer);
    }

}
