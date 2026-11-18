package tn.esprit.autolocapi.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.repository.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
@RequestMapping("/api/clients")
public class IClientServiceImp implements IClientService{

    private final ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void supprimerClientById(Long id) {
        clientRepository.deleteById(id);

    }

}
