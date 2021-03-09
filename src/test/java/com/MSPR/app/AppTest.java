package com.MSPR.app;

import static org.junit.Assert.assertTrue;
//import com.MSPR.app.MyClass;
import org.junit.Test;

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
    public void shouldFail()
    {
        MyClass test = new MyClass();

        assertTrue(test.shouldReturnTrue());
        
    }
}
