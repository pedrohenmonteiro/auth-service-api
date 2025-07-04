package br.com.pedromonteiro.auth_service_api.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedromonteiro.auth_service_api.controller.AuthController;
import models.requests.AuthenticateRequest;
import models.responses.AuthenticationResponse;

@RestController
public class AuthControllerImpl implements AuthController {

 
    @Override
    public ResponseEntity<AuthenticationResponse> authenticate(final AuthenticateRequest request) throws Exception {
        return null;
    }


}
