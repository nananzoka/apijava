package apibase.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apibase.model.Produto;

@Repository
public interface ProdutoController extends JpaRepository<Produto, Long> {
    
}