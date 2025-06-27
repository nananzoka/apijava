package apibase.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import apibase.model.Cidade;
import apibase.repository.CidadeRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class CidadeController {
    
    @Autowired
    private CidadeRepository cidadeRepository;

    // Listar todos os clientes
    @GetMapping("/cidade")
    @ResponseStatus(HttpStatus.OK)
    public List<Cidade> getAll() {
        return this.cidadeRepository.findAll();
    }
}