package com.example.spsample;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/saml2/**").permitAll()
            .antMatchers("/**").authenticated()
            .and()
            .saml2Login()
        ;
    }

//    @Autowired
//    RelyingPartyRegistrationRepository relyingPartyRegistrationRepository;

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        Converter<HttpServletRequest, RelyingPartyRegistration> relyingPartyRegistrationResolver =
//                new DefaultRelyingPartyRegistrationResolver(this.relyingPartyRegistrationRepository);
//
//        Saml2MetadataFilter filter = new Saml2MetadataFilter(
//                relyingPartyRegistrationResolver,
//                new OpenSamlMetadataResolver());
//
//        http
//                .saml2Login(withDefaults())
//                .addFilterBefore(filter, Saml2WebSsoAuthenticationFilter.class)
//                .antMatcher("/**")
//                .authorizeRequests()
//                .antMatchers("/**").authenticated();
//    }
}
