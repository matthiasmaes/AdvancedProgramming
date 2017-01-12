/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TicTacToe.TicTacToeEntity;
import TicTacToe.TicTacToeLogic;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MatthiasMaes
 */
public class TictTacToeTest {
    
    // Settings
    private final int LOWERBOUND = 1;
    private final int UPPERBOUND = 100;
    private final int LENGTHARRAY = 100;
    
    
    // Fields
    TicTacToeEntity TTT;
    TicTacToeLogic logic = new TicTacToeLogic();
    private final Map SPECIALS = new TreeMap();
    private int[] originalArray = new int[LENGTHARRAY];
    
    
    @Before
    public void setUp() {
        
        // Set up object
        SPECIALS.put(3, "Tic");
        SPECIALS.put(5, "Tac");
        SPECIALS.put(7, "Toe");
        

        // Fill original array
        for(int i = 0; i < LENGTHARRAY; i++) originalArray[i] = (int) (Math.random() * UPPERBOUND + LOWERBOUND);
        
        TTT = new TicTacToeEntity(LOWERBOUND, UPPERBOUND, SPECIALS, originalArray);

    }
    
    @Test
    public void testObjectParams(){
        assertEquals(SPECIALS, TTT.getSpecials());
        assertEquals(LOWERBOUND, TTT.getLowerbound());
        assertEquals(UPPERBOUND, TTT.getUpperbound());
    }

    @Test
    public void testUpperLowerBound(){
        for (int intToTest : originalArray) {
            if (intToTest > UPPERBOUND) fail("Upperbound not respected");
            if (intToTest < LOWERBOUND) fail("Lowerbound not respected");
        }
    }
    
    @Test
    public void testExactNumberReplacement(){
        
        // Make sure special values are present
        TTT.setOriginalArray(0, (int) TTT.getSpecials().keySet().toArray()[0]);
        TTT.setOriginalArray(1, (int) TTT.getSpecials().keySet().toArray()[1]);
        TTT.setOriginalArray(2, (int) TTT.getSpecials().keySet().toArray()[2]);
        
        // Execute replacement
        logic.ReplaceExactNumber(TTT);
        
        // Test all replacements
        assertEquals(TTT.getResultArray()[0], TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[0]));
        assertEquals(TTT.getResultArray()[1], TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[1]));
        assertEquals(TTT.getResultArray()[2], TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[2]));
    }
    
    @Test
    public void testMultipleDigitReplacement(){
        
        // Make sure special values are present
        TTT.setOriginalArray(10, Integer.parseInt(TTT.getSpecials().keySet().toArray()[0].toString() + TTT.getSpecials().keySet().toArray()[0].toString()));
        TTT.setOriginalArray(11, Integer.parseInt(TTT.getSpecials().keySet().toArray()[1].toString() + TTT.getSpecials().keySet().toArray()[1].toString()));
        TTT.setOriginalArray(12, Integer.parseInt(TTT.getSpecials().keySet().toArray()[2].toString() + TTT.getSpecials().keySet().toArray()[2].toString()));
        
        // Execute replacement
        logic.ReplaceExactNumber(TTT);
        
        // Test all replacements
        assertEquals(TTT.getResultArray()[10], TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[0]).toString() + " " + TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[0]).toString() + " ");
        assertEquals(TTT.getResultArray()[11], TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[1]).toString() + " " + TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[1]).toString() + " ");
        assertEquals(TTT.getResultArray()[12], TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[2]).toString() + " " + TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[2]).toString() + " ");
    }
    
    
    @Test
    public void testDeviderReplacement(){
        
        // Make sure special values are present
        TTT.setOriginalArray(0, (int)TTT.getSpecials().keySet().toArray()[0] * (int)TTT.getSpecials().keySet().toArray()[0]);
        TTT.setOriginalArray(1, (int)TTT.getSpecials().keySet().toArray()[1] * (int)TTT.getSpecials().keySet().toArray()[1]);
        TTT.setOriginalArray(2, (int)TTT.getSpecials().keySet().toArray()[2] * (int)TTT.getSpecials().keySet().toArray()[2]);

        for (int intToTest : TTT.getOriginalArray()) System.out.println(intToTest);
        System.out.println("---------------");
     
    
        // Execute replacement
        logic.ReplaceDevider(TTT);
        
        
        for (String intToTest : TTT.getResultArray()) System.out.println(intToTest);
        
        // Test all replacements
        assertEquals(TTT.getResultArray()[0], TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[0]));
        assertEquals(TTT.getResultArray()[1], (TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[1])));
        assertEquals(TTT.getResultArray()[2], TTT.getSpecials().get((int) TTT.getSpecials().keySet().toArray()[2]));
    }
}