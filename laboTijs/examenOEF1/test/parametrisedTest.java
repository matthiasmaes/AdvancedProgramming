

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tijs
 */
@RunWith(Parameterized.class)
public class parametrisedTest {
    public Map<String, String> map = new HashMap<String,String>();
    
    public parametrisedTest(int input, String expected) {
        fInput= input;
        fExpected= expected;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
            { 2, "2" },
            { 3, "Tic Tic" }, 
            { 5, "Tac Tac" },   
            { 7, "Toe Toe" }, 
            { 9, "Tic" },
            { 10, "Tac" },
            { 15, "Tic Tac Tac" },
            { 35, "Tic Tac Tac Toe" } 
        });
    }

    
    private int fInput;

    private String fExpected;

    @Test
    public void test() {
        map.put("3","Tic");
        map.put("5","Tac");
        map.put("7","Toe");
        
        TicTacToe all = new TicTacToe(0,100,map);
        assertEquals(fExpected, all.DivideAndReplaceMultipleNumbers(fInput));
    }  
}
