package apibase.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import apibase.exception.ResourceNotFoundException;
import apibase.model.Cliente;
import apibase.model.Produto;
import apibase.model.Regiao;
import apibase.repository.ProdutoRepository;
import apibase.repository.RegiaoRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class RegiaoController {
    @Autowired
    private RegiaoRepository regiaoRepository;
    // Listar todos os produtos
    @GetMapping("/regiao")
    @ResponseStatus(HttpStatus.OK)
    public List<Regiao> getAll() {
        return this.regiaoRepository.findAll();
    }
    // Criar um novo produto
    @PostMapping("/regiao")
    @ResponseStatus(HttpStatus.CREATED)
    public Regiao createRegiao(@RequestBody Regiao model) {
        return this.regiaoRepository.save(model);
    }
    // Atualizar um produto
    @PutMapping("/regiao/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Regiao updateCadastro(@PathVariable Long id, @RequestBody Regiao model)
    throws ResourceNotFoundException {
        // Verifica se o cadastro existe
        Regiao cadastro = regiaoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException
                        ("Cadastro não encontrado para o ID : " + id));
        
        if (model.getNome() != null) { 
            cadastro.setNome(model.getNome());
        }
        if (model.getDescricao() != null) { 
            cadastro.setDescricao(model.getDescricao());
        }
        if (model.getEstado() != 0) { 
            cadastro.setEstado(model.getEstado());
        }
        if (model.getMetavendas() != 0) { 
            cadastro.setMetavendas(model.getMetavendas());
        }
        if (model.getResponsavel() != 0) { 
            cadastro.setResponsavel(model.getResponsavel());
            
        }
        return this.regiaoRepository.save(cadastro);
    }
    // id SERIAL PRIMARY KEY,
    //nome VARCHAR(100) NOT NULL,
    //descricao TEXT,
    //estado VARCHAR(2),
    //meta_vendas DECIMAL(12, 2),
    //responsavel VARCHAR(100)
   
   
    // Deletar um produto
    @DeleteMapping("/regiao/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteRegiao(@PathVariable Long id) {
        this.regiaoRepository.deleteById(id);
    }
    // Buscar um produto por ID
    @GetMapping("/regiao/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Regiao getById(@PathVariable Long id) {
        return this.regiaoRepository.findById(id).orElse(null);
    }    
}