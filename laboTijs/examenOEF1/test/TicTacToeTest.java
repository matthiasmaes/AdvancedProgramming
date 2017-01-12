/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tijs
 */
public class TicTacToeTest {
    
    public TicTacToe ttt = new TicTacToe();
    public TicTacToeTest() {
    }

    @Test
    public void testReplace3() {
       String[] result = new String[34];
       for(int i=0; i<34; i++){
          result[i] = ttt.Replace(i, "Tic", 3);
       }
       
       assert(result[3].equals("Tic"));
       assert(result[13].equals("Tic"));
       assert(result[33].equals("Tic Tic"));
       assert(result[4].equals("4"));
    }
    
    @Test
    public void testDivide3() {
       String[] result = new String[34];
       for(int i=0; i<34; i++){
          result[i] = ttt.Divide(i, "Tic", 3);
       }
       
       assert(result[3].equals("Tic Tic"));
       assert(result[9].equals("Tic"));
       assert(result[13].equals("Tic"));
       assert(result[23].equals("Tic"));
       assert(result[33].equals("Tic Tic Tic"));
       assert(result[4].equals("4"));
    }
    
    @Test
    public void testReplace5() {
       String[] result = new String[56];
       for(int i=0; i<56; i++){
          result[i] = ttt.Replace(i, "Tac", 5);
       }
       
       assert(result[5].equals("Tac"));
       assert(result[15].equals("Tac"));
       assert(result[55].equals("Tac Tac"));
       assert(result[4].equals("4"));
    }
    
    @Test
    public void testDivide5() {
       String[] result = new String[56];
       for(int i=0; i<56; i++){
          result[i] = ttt.Divide(i, "Tac", 5);
       }
       
       assert(result[5].equals("Tac Tac"));
       assert(result[10].equals("Tac"));
       assert(result[15].equals("Tac Tac"));
       assert(result[55].equals("Tac Tac Tac"));
       assert(result[4].equals("4"));
    }
    /*
    @Test
    public void testDivide3And5() {
       String[] result = new String[56];
       for(int i=0; i<56; i++){
          result[i] =  ttt.DivideBy3And5(i);
       }
       
       assert(result[3].equals("Tic Tic"));
       assert(result[9].equals("Tic"));
       assert(result[13].equals("Tic"));
       assert(result[33].equals("Tic Tic Tic"));
       assert(result[4].equals("4"));
       assert(result[5].equals("Tac Tac"));
       assert(result[10].equals("Tac"));
       assert(result[25].equals("Tac Tac"));
       assert(result[55].equals("Tac Tac Tac"));
       assert(result[15].equals("Tic Tac Tac"));
       assert(result[30].equals("Tic Tic Tac"));
       assert(result[35].equals("Tic Tac Tac"));
    }
    */
     @Test
    public void testReplace7() {
       String[] result = new String[78];
       for(int i=0; i<78; i++){
          result[i] = ttt.Replace(i, "Toe", 7);
       }
       
       assert(result[7].equals("Toe"));
       assert(result[17].equals("Toe"));
       assert(result[77].equals("Toe Toe"));
       assert(result[4].equals("4"));
    }
    
    @Test
    public void testDivide7() {
       String[] result = new String[78];
       for(int i=0; i<78; i++){
          result[i] = ttt.Divide(i, "Toe", 7);
       }
       
       assert(result[7].equals("Toe Toe"));
       assert(result[14].equals("Toe"));
       assert(result[17].equals("Toe"));
       assert(result[77].equals("Toe Toe Toe"));
       assert(result[4].equals("4"));
    }
    /*
    @Test
    public void testDivide3And5And7() {
       String[] result = new String[110];
       for(int i=0; i<110; i++){
          result[i] =  ttt.DivideBy3And5And7(i);
       }
       
       assert(result[3].equals("Tic Tic"));
       assert(result[5].equals("Tac Tac"));
       assert(result[7].equals("Toe Toe"));
       assert(result[9].equals("Tic"));
       assert(result[10].equals("Tac"));
       assert(result[12].equals("Tic"));
       assert(result[13].equals("Tic"));
       assert(result[14].equals("Toe"));
       assert(result[15].equals("Tic Tac Tac"));
       assert(result[17].equals("Toe"));
       assert(result[21].equals("Tic Toe"));
       assert(result[25].equals("Tac Tac"));
       assert(result[27].equals("Tic Toe"));
       assert(result[30].equals("Tic Tic Tac"));
       assert(result[35].equals("Tic Tac Tac"));
       assert(result[105].equals("Tic Tac Toe"));
    }
    */
}
