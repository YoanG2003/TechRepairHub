package com.example.techrepairhub.services;

import org.springframework.stereotype.Service;
import com.example.techrepairhub.repositories.*;
import com.example.techrepairhub.models.*;
import java.util.*;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
}

