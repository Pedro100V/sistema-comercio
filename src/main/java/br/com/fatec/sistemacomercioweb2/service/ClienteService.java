package br.com.fatec.sistemacomercioweb2.service;
import br.com.fatec.sistemacomercioweb2.model.Cliente;
import br.com.fatec.sistemacomercioweb2.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
private final ClienteRepository repository;
public ClienteService(ClienteRepository repository) {
    this.repository = repository;
}
public List<Cliente> listar() {
    return repository.findAll();
}
public Cliente cadastrar(Cliente cliente) {
    return repository.save(cliente);
}
}
