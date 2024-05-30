package auth0_practica.tp_auth0.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/client", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {

    @GetMapping("")
    public ResponseEntity<?> publicEndpoint() {
        return ResponseEntity.status(HttpStatus.OK).body("Este es un edpoint de usuario. " +
                "Podes ver esta respuesta porque te has autenticado como cliente");
    }
}
