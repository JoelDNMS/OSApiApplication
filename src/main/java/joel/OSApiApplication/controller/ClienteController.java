/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joel.OSApiApplication.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import joel.OSApiApplication.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author sesideva
 */
@RestController
public class ClienteController {
    
    @PersistenceContext
    private EntityManager manager;
            
    List<Cliente> listaClientes;
   
    @GetMapping("/clientes")
    public List<Cliente> listas() {
        
        listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1, "SantzK", "santzk69@teste.com", "11-22222-3333"));
        listaClientes.add(new Cliente(1, "Vitoria", "ViToria@teste.com", "11-33333-4444"));
        listaClientes.add(new Cliente(1, "Lucas", "luscasDev@teste.com", "11-44444-5555"));
        listaClientes.add(new Cliente(1, "Lucas", "luscasDev@teste.com", "11-44444-5555"));
        listaClientes.add(new Cliente(1, "kge", "kge@teste.com", "11-55555-5555"));
        listaClientes.add(new Cliente(2, "Rodrigo", "Rodri@teste.com", "11-66666-7777"));
        listaClientes.add(new Cliente(3, "Maiara", "Mai@teste.com", "11-88888-9999"));
        listaClientes.add(new Cliente(4, "Americo", "americo@teste.com", "11-22333-4455"));
        
        return manager.createQuery("from Cliente", Cliente.class)
                .getResultList();
    }
}
