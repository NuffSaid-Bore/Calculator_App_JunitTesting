package com.java.Services;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.java.data.UserRepository;

public class AuthenticationServiceTest {
    private AuthenticationServices services;

    private UserRepository repository;

    @Before
    public void setUp(){
        repository = mock(UserRepository.class);
        services = new AuthenticationServices(repository);
    }

    @Test
    public void testAuthentication(){
        // Arrange
        when(repository.findByUsername(anyString())).thenThrow(new IllegalArgumentException());



        // Act
        services.authenticate("harry", "harry12345");

        // We will not even reach  the assert because on our Act we're throwing an illigalArgumentException 

        // Assert
    }
}
