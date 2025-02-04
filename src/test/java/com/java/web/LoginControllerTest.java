package com.java.web;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import com.java.Services.AuthenticationServices;

public class LoginControllerTest {

    private LoginController controller;
    private AuthenticationServices services;
    
    @Before
    public void setUp() throws Exception{
        this.services = mock(AuthenticationServices.class);
        this.controller = new LoginController(this.services);

    }

    @Test
    public void serviceTestForLoginController(){
        // Arrange
        when(services.authenticate(anyString(), anyString())).thenReturn(true);

        // Act
        String viewPath = controller.service("tom", "password123");


        // Assert
        assertNotNull(viewPath);
        assertEquals("/home",viewPath);
    }

    
}
