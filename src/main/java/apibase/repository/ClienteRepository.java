package apibase.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apibase.model.Cliente;

@Repository 

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);
    List<Cliente> findByEmail(String email);
    List<Cliente> findByCelular(String celular);
    List<Cliente> findByCidade(String cidade);
        
}