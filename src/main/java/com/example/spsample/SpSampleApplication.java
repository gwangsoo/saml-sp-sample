package com.example.spsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Saml2RelyingPartyAutoConfiguration.class)
public class SpSampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpSampleApplication.class, args);
    }
}
