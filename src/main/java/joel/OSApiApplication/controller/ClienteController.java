/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joel.OSApiApplication.controller;

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
    
    List<Cliente> listaClientes;
   
    @GetMapping("/clientes")
    public List<Cliente> listas() {
        
        listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1, "SantzK", "santzk69@teste.com", "11-22222-3333"));
        listaClientes.add(new Cliente(1, "Vitoria", "ViToria@teste.com", "11-33333-4444"));
        listaClientes.add(new Cliente(1, "Lucas", "luscasDev@teste.com", "11-44444-5555"));
        
        return listaClientes;
    }
}
