package apibase.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import apibase.model.Cliente;
import apibase.repository.ClienteRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos os clientes
    @GetMapping("/cliente")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getAll() {
        return this.clienteRepository.findAll();
    }
}