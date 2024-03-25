package com.adilsonfuxe.security.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {


  private final AuthenticationService service;

  public AuthenticationController(AuthenticationService service) {
    this.service = service;
  }

  @PostMapping("sign-up")
  public ResponseEntity<AuthenticationResponse> signUp(
      @RequestBody SignUpRequest request
  ) {
    return ResponseEntity.ok(service.signUp(request));
  }

  @PostMapping("sign-in")
  public ResponseEntity<AuthenticationResponse> signIn(
      @RequestBody SignInRequest request
  ) {
    return ResponseEntity.ok(service.signIn(request));
  }
}
