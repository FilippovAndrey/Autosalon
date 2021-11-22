package ru.home.autosalon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.home.autosalon.models.Clients;
import ru.home.autosalon.services.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Clients> getAll(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Clients getById(@PathVariable Long id){
        return clientService.getById(id);
    }

    @PostMapping
    public Clients create(@RequestBody Clients clients){
        return clientService.create(clients);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clientService.delete(id);
    }

}
