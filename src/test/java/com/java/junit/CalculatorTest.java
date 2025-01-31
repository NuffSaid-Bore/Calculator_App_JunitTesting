package com.java.junit;
import static org.junit.Assert.*;

import org.junit.Test;
public class CalculatorTest {
    
    // Arrange
            // Where setup is made, creating objects, mockup jacks

        // Act
            // method being tested( It's ususally one line)

        // Assert
            // Where you have your asserte.g Assert.fail(), Assert.assertNotNull(), Assert.equals()
    @Test
    public void addTest(){
        assertEquals(3, Calculator.add(1,2));
        assertEquals(-2, Calculator.add(-1,-1));
        
    }

}
