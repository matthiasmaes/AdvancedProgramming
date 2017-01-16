
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tijs
 */
public class TicTacToe {
    public int max;
    public int min;
    public int chckNum;
    public String word;
    Map<String, String> map = new HashMap<String,String>();
    
    public TicTacToe(int min, int max, String word, int num){
        this.min= min;
        this.max= max;
        this.chckNum = num;
        this.word= word;
    }
    
     public TicTacToe(int min, int max, Map<String,String> elements){
        this.min= min;
        this.max= max;
        this.map = elements;
    }
        
    public String Replace(int number){
        String Snum = ""+number;
        String newStr = "";
        
        char[] charArray = Snum.toCharArray();
        Stream<String> str;
        for(char num : charArray){
            if(num == Integer.toString(chckNum).charAt(0)) newStr += word+" "; 
        }
        if(Snum.contains(""+chckNum))return newStr.trim();        
        else return Snum;
    }
    
    public String Divide(int number){
        String Snum = ""+number;
        String rep = Replace(number);
        if(number%chckNum == 0 && Snum.contains(""+chckNum)) return rep += " "+word;
        else if(number%chckNum == 0) return word;
        else return rep;
    }
    
    public String DivideAndReplaceMultipleNumbers(int number){
        String Snum = ""+number;
        Boolean changed = false;
        char[] charArray = Snum.toCharArray();
        String result= "";
        
        if(map.isEmpty())throw new IllegalArgumentException();
        else{
            for(Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
            
                for(char num : charArray)if(num == key.charAt(0)){
                    changed = true;
                    result += value+" ";
                } 
                if(number%Integer.parseInt(key)== 0){
                    changed=true;
                    result += value+" ";
                }
            }
        }
        if(!changed) return Snum;
        else return result.trim();
    }
}
