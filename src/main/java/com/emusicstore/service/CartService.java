package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by Buhari on 4/24/2017.
 */
public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
