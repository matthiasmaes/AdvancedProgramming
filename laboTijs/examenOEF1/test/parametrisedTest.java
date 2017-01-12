/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 *
 * @author tijs
 */
@RunWith(Parameterized.class)
public class parametrisedTest {
    
    public parametrisedTest() {
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
            { "2", "2" },
            { "3", "Tic Tic" }, 
            { "5", "Tac Tac" },   
            { "7", "Toe" }, 
            { "9", "Tic" },
            { "10", "Tac" },
            { "15", "Tic Tac Tac" },
            { "35", "Tic Tac Tac Toe" } 
        });
    }

    @Parameter // first data value (0) is default
    public /* NOT private */ int fInput;

    @Parameter(value = 1)
    public /* NOT private */ int fExpected;

    @Test
    public void test() {
        assertEquals(fExpected, Fibonacci.compute(fInput));
    }
    
}
