/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author MatthiasMaes
 */
public class TicTacToeEntity {
    private int lowerbound;
    private int upperbound;
    private Map specials;
    
    private int[] originalArray;
    private String[] resultArray;
    
    
    
    public TicTacToeEntity(int lowerbound, int upperbound, Map specials, int[] originalArray){
        this.lowerbound = lowerbound;
        this.upperbound = upperbound;
        this.specials = specials;
        this.originalArray = originalArray;
        this.resultArray = new String[this.originalArray.length];
    }
    
    
    
    public int getLowerbound(){
        return this.lowerbound;
    }
    
    public int getUpperbound(){
        return this.upperbound;
    }
    
    public Map getSpecials(){
        return this.specials;
    }
      
    public int[] getOriginalArray(){
        return this.originalArray;
    }
    
    
    public String[] getResultArray(){
        return this.resultArray;
    }
    
    public void setOriginalArray(int index, int value){
        this.originalArray[index] = value;
    }
    public void setResultArray(int index, String value){
        this.resultArray[index] = value;
    }
    
    
    
    
}
