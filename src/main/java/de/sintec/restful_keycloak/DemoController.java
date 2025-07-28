
package de.sintec.restful_keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(Principal principal) {
        return "Hallo, " + principal.getName() ;
    }

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Dies ist ein öffentlicher Endpunkt.";
    }
}
