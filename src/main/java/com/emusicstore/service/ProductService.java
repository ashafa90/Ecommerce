package com.emusicstore.service;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by Buhari on 4/24/2017.
 */
public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
