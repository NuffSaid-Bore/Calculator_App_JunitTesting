package com.java.Services;

import com.java.Models.User;
import com.java.data.UserRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationServices {

    private UserRepository userRepo;
    
    public boolean authenticate(String username, String password){
        
        User user = userRepo.findByUsername(username);

        return user.getPassword().equals(password);
    }
}
