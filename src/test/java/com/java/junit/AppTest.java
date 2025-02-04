package com.java.junit;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testIt(){
        Calendar mockCalendar = Mockito.mock(Calendar.class);
    }
}
