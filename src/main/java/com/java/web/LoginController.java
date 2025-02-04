package com.java.web;

import com.java.Services.AuthenticationServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class LoginController {

    private AuthenticationServices authenticationServices;
    public String service(String username, String password){
        // send to: /home
        // send to: /login

        return(authenticationServices.authenticate(username, password)) ? "/home" : "/login";
        
    }
}
