package com.tallerDistribuidos.ProductList.Services;

import com.tallerDistribuidos.ProductList.Entity.Client;
import com.tallerDistribuidos.ProductList.Entity.Product;
import com.tallerDistribuidos.ProductList.Repository.ClientRepository;
import com.tallerDistribuidos.ProductList.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> obtenerTodosLosClientes() {
        return clientRepository.findAll();
    }
}