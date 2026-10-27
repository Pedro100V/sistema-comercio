package br.com.fatec.sistemacomercioweb2;

import br.com.fatec.sistemacomercioweb2.model.Cliente;
import br.com.fatec.sistemacomercioweb2.service.ClienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class TesteCliente {
    public static void main(String[] args) {
        // Inicializa o Spring Boot
        try (ConfigurableApplicationContext context =
                     SpringApplication.run(
                             SistemaComercioWeb2Application.class, args)) {
            // Obtém o Service gerenciado pelo Spring
            ClienteService service =
                    context.getBean(ClienteService.class);
            // TESTE 1 - CADASTRAR CLIENTE
            Cliente cliente = new Cliente(
                    "Pedro Teste maven ",
                    "33344466777",
                    "11999394999",
                    "pedromaven2@email.com"
            );
            Cliente clienteSalvo = service.cadastrar(cliente);
            System.out.println("Cliente cadastrado!" + clienteSalvo);
            // TESTE 2 - LISTAR CLIENTES
            System.out.println("\nLISTA DE CLIENTES:");
            for (Cliente c : service.listar()) {
                System.out.println(c);
            }
        }
    }
}