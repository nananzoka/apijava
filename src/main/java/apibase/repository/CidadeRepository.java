package apibase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apibase.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    List<Cidade> findByDescricao(String descricao);

    List<Cidade> findByUf(String uf);

    List<Cidade> findByRegiaoid(Long regiaoid);
}