package com.emusicstore.service;

import com.emusicstore.model.CustomerOrder;

/**
 * Created by Buhari on 4/24/2017.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
