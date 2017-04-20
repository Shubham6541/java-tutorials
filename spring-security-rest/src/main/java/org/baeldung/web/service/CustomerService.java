package org.nklkarthi.web.service;

import java.util.List;

import org.nklkarthi.persistence.model.Customer;

public interface CustomerService {

    List<Customer> allCustomers();

    Customer getCustomerDetail(final String id);

}
