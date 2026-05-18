package com.example.HATEOASTest.userbank;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class ClientController {

    private final ClientService clientService;
    private final ObjectMapper clientMapper;
    public ClientController(ClientService clientService, ObjectMapper clientMapper) {
        this.clientService = clientService;
        this.clientMapper = clientMapper;
    }

    @PostMapping
    public ResponseEntity<Client> createUser(@RequestBody ClientRequest clientRequest) {
        Client client = clientService.createUser(clientRequest);
        return ResponseEntity.ok(client);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getUserById(@PathVariable("id") Long id) {
        return clientService.findUserById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
