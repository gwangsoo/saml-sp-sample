package com.example.spsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/login/saml2/sso/ssoLogin.do")
    public String index() {
        return "index";
    }
}
