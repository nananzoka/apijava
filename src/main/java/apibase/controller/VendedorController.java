package apibase.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apibase.model.Vendedor;

@Repository
public interface VendedorController extends JpaRepository<Vendedor, Long> {
    
}