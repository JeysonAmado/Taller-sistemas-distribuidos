package com.tallerDistribuidos.ProductList.Services;


import com.tallerDistribuidos.ProductList.Entity.Product;
import com.tallerDistribuidos.ProductList.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> obtenerTodosLosProductos() {
        return productRepository.findAll();
    }
}