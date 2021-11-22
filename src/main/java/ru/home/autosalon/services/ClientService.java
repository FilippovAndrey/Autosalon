package ru.home.autosalon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.autosalon.models.Clients;
import ru.home.autosalon.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Clients> getAll() {
        return clientRepository.findAll();
    }

    public Clients getById(Long id) {
        return clientRepository.getById(id);
    }

    public Clients create(Clients client) {
        return clientRepository.save(client);
    }

    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

}
