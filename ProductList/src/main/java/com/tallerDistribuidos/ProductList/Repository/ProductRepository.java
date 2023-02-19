package com.tallerDistribuidos.ProductList.Repository;

import com.tallerDistribuidos.ProductList.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
