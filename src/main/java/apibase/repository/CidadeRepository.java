package apibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apibase.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}