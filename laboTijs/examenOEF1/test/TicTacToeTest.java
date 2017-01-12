/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.HashMap;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;
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
    public Map<String, String> map = new HashMap<String,String>();
    
    public TicTacToe tic3 = new TicTacToe(0,34,"Tic",3);
    public TicTacToe tac5 = new TicTacToe(0,56,"Tac",5);
    public TicTacToe toe7 = new TicTacToe(0,78,"Toe",7);
    
    
    public TicTacToeTest() {

    }

    @Test
    public void testReplace3() {
       String[] result = new String[tic3.max];
       for(int i=tic3.min; i<tic3.max; i++){
          result[i] = tic3.Replace(i);
       }
       
       assert(result[3].equals("Tic"));
       assert(result[13].equals("Tic"));
       assert(result[33].equals("Tic Tic"));
       assert(result[4].equals("4"));
    }
    
    @Test
    public void testDivide3() {
       String[] result = new String[tic3.max];
       for(int i=tic3.min; i<tic3.max; i++){
          result[i] = tic3.Divide(i);
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
      String[] result = new String[tac5.max];
       for(int i=tac5.min; i<tac5.max; i++){
          result[i] = tac5.Replace(i);
       }
       
       assert(result[5].equals("Tac"));
       assert(result[15].equals("Tac"));
       assert(result[55].equals("Tac Tac"));
       assert(result[4].equals("4"));
    }
    
    @Test
    public void testDivide5() {
       String[] result = new String[tac5.max];
       for(int i=tac5.min; i<tac5.max; i++){
          result[i] = tac5.Divide(i);
       }
       
       assert(result[5].equals("Tac Tac"));
       assert(result[10].equals("Tac"));
       assert(result[15].equals("Tac Tac"));
       assert(result[55].equals("Tac Tac Tac"));
       assert(result[4].equals("4"));
    }
    
     @Test
    public void testReplace7() {
       String[] result = new String[toe7.max];
       for(int i=toe7.min; i<toe7.max; i++){
          result[i] = toe7.Replace(i);
       }
       
       assert(result[7].equals("Toe"));
       assert(result[17].equals("Toe"));
       assert(result[77].equals("Toe Toe"));
       assert(result[4].equals("4"));
    }
    
    @Test
    public void testDivide7() {
       String[] result = new String[toe7.max];
       for(int i=toe7.min; i<toe7.max; i++){
          result[i] = toe7.Divide(i);
       }
       
       assert(result[7].equals("Toe Toe"));
       assert(result[14].equals("Toe"));
       assert(result[17].equals("Toe"));
       assert(result[77].equals("Toe Toe Toe"));
       assert(result[4].equals("4"));
    }
   
    @Test
    public void testAll() {
        map.put("3","Tic");
        map.put("5","Tac");
        map.put("7","Toe");
        
        TicTacToe all = new TicTacToe(0,100,map);
        
        String[] result = new String[all.max];
        for(int i=all.min; i<all.max; i++){
           result[i] = all.DivideAndReplaceMultipleNumbers(i);
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
        assert(result[35].equals("Tic Tac Tac Toe"));
    }
}
