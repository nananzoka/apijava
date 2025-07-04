package apibase.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import apibase.exception.ResourceNotFoundException;
import apibase.model.Regiao;
import apibase.repository.RegiaoRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class RegiaoController {
    @Autowired
    private RegiaoRepository regiaoRepository;
    // Listar todas as regiões
    @GetMapping("/regiao")
    @ResponseStatus(HttpStatus.OK)
    public List<Regiao> getAll() {
        return this.regiaoRepository.findAll();
    }
    // Criar uma nova região
    @PostMapping("/regiao")
    @ResponseStatus(HttpStatus.CREATED)
    public Regiao createRegiao(@RequestBody Regiao model) {
        return this.regiaoRepository.save(model);
    }
    // Atualizar uma região
    @PutMapping("/regiao/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Regiao updateRegiao(@PathVariable Long id, @RequestBody Regiao model)
            throws ResourceNotFoundException {
        Regiao regiao = regiaoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Região não encontrada para o ID: " + id));
        if (model.getNome() != null) {
            regiao.setNome(model.getNome());
        }
        if (model.getDescricao() != null) {
            regiao.setDescricao(model.getDescricao());
        }
        if (model.getEstado() != null) {
            regiao.setEstado(model.getEstado());
        }
        if (model.getMeta_vendas() != null) {
            regiao.setMeta_vendas(model.getMeta_vendas());
        }
        if (model.getResponsavel() != null) {
            regiao.setResponsavel(model.getResponsavel());
        }
        return this.regiaoRepository.save(regiao);
    }
    // Deletar uma região
    @DeleteMapping("/regiao/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteRegiao(@PathVariable Long id) {
        this.regiaoRepository.deleteById(id);
    }
    // Buscar uma região por ID
    @GetMapping("/regiao/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Regiao getById(@PathVariable Long id) {
        return this.regiaoRepository.findById(id).orElse(null);
    }
}