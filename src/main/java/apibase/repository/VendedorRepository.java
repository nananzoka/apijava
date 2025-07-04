package apibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apibase.model.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
    
}