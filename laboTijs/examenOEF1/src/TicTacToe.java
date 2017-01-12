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
    
    public TicTacToe(int min, int max, String word, int num){
        this.min= min;
        this.max= max;
        this.chckNum = num;
        this.word= word;
    }
    public String Replace(int number){
        String Snum = ""+number;
        String newStr = "";
        char[] charArray = Snum.toCharArray();
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
  
    /*
    public String DivideBy3And5(int number){
        String Snum = ""+number;
        
        if((number%3 == 0 && number%5 == 0) || (number%3 == 0 && Snum.contains("5")) || (number%5 == 0 && Snum.contains("3"))){
            String D5 = Divide5(number);
            String D3 = Divide3(number);
            
            return D3 + " " + D5;
        }
        else if(number%3==0 || Snum.contains("3")){
            return Divide3(number);
        }
        else if(number%5==0 || Snum.contains("5")){
            return Divide5(number);
        }
        else return Snum;
    }
    
     public String DivideBy3And5And7(int number){
        String Snum = ""+number;
        
        if((number%3 == 0 && number%5 == 0) || (number%3 == 0 && Snum.contains("5")) || (number%5 == 0 && Snum.contains("3"))){
            String D5 = Divide5(number);
            String D3 = Divide3(number);
            
            return D3 + " " + D5;
        }
        else if(number%3==0 || Snum.contains("3")){
            return Divide3(number);
        }
        else if(number%5==0 || Snum.contains("5")){
            return Divide5(number);
        }
        else return Snum;
    }*/
}
