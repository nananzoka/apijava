package apibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apibase.model.Produto;

@Repository                                            
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}