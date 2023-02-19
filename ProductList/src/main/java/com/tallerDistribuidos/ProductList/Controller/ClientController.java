package com.tallerDistribuidos.ProductList.Controller;

import com.tallerDistribuidos.ProductList.Entity.Client;
import com.tallerDistribuidos.ProductList.Entity.Product;
import com.tallerDistribuidos.ProductList.Services.ClientService;
import com.tallerDistribuidos.ProductList.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> obtenerTodosLosClientes() {
        return clientService.obtenerTodosLosClientes();
    }
}