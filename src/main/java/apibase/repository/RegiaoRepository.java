package apibase.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apibase.model.Regiao;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long> {
    List<Regiao> findByDescricao(String descricao);
}