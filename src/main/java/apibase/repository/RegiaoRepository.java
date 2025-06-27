package apibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apibase.controller.Regiao;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long> {
}