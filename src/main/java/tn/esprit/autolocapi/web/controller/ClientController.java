package tn.esprit.autolocapi.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.service.IClientService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/clients")
public class ClientController {
    private final IClientService clientService;
    @PostMapping
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }
    @PutMapping
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
    @DeleteMapping("/{id}")
    public void SupprimerClientById(@PathVariable Long id) {
        clientService.supprimerClientById(id);
    }
}
