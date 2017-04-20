package org.nklkarthi.web.service;

import java.util.List;

import org.nklkarthi.persistence.model.Order;

public interface OrderService {

    List<Order> getAllOrdersForCustomer(String customerId);

    Order getOrderByIdForCustomer(String customerId, String orderId);

}
