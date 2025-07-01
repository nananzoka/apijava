package apibase.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import apibase.exception.ResourceNotFoundException;
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
    // Inserir
    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente createCadastro(@RequestBody Cliente model) {
        return this.clienteRepository.save(model);
    }
    // Atualizar
    @PutMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente updateCadastro(@PathVariable Long id, @RequestBody Cliente model)
    throws ResourceNotFoundException {
        // Verifica se o cadastro existe
        Cliente cadastro = clienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException
                        ("Cadastro não encontrado para o ID : " + id));
        if (model.getNome() != null) {
            cadastro.setNome(model.getNome());
        }
        if (model.getEmail() != null) {
            cadastro.setEmail(model.getEmail());
        }
        if (model.getCelular() != null) {
            cadastro.setCelular(model.getCelular());
        }       
        if (model.getCidade() != null) {
            cadastro.setCidade(model.getCidade());
        }
        return this.clienteRepository.save(cadastro);
    }
    // Deletar
    @DeleteMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCadastro(@PathVariable Long id) {
        this.clienteRepository.deleteById(id);
    }
    // Buscar por ID
    @GetMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente getById(@PathVariable Long id) {
        return this.clienteRepository.findById(id).orElse(null);
    }
    // Buscar por nome
    @GetMapping("/cliente/nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getByNome(@PathVariable String nome) {
        return this.clienteRepository.findByNome(nome);
    }
    // Buscar por email
    @GetMapping("/cliente/email/{email}")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getByEmail(@PathVariable String email) {
        return this.clienteRepository.findByEmail(email);
    }
    // Buscar por celular
    @GetMapping("/cliente/celular/{celular}")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getByCelular(@PathVariable String celular) {
        return this.clienteRepository.findByCelular(celular);
    }
    // Buscar por cidade
    @GetMapping("/cliente/cidade/{cidade}")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getByCidade(@PathVariable String cidade) {
        return this.clienteRepository.findByCidade(cidade);
    }
}