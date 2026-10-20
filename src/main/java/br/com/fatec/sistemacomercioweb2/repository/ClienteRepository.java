package br.com.fatec.sistemacomercioweb2.repository;
import br.com.fatec.sistemacomercioweb2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepository extends JpaRepository<Cliente,
        Long> {
}