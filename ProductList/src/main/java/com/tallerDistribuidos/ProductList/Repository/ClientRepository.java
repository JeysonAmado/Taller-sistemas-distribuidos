package com.tallerDistribuidos.ProductList.Repository;

import com.tallerDistribuidos.ProductList.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
