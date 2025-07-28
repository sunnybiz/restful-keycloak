
package de.sintec.restful_keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(Principal principal) {
        String result;
        if (principal == null) {
            result = "principal==null";
        }
        else {
            String name = principal.getName();
            if (name == null) {
                result = "principal.Name==null";
            }
            else {
                result = "principal.Name==\"" + principal.getName() + "\"";
            }
        }
        return result;
    }

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Dies ist ein öffentlicher Endpunkt.";
    }
}
