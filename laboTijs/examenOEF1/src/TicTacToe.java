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
    public String Replace3(int number){
        String Snum = ""+number;
        String newStr = "";
        char[] charArray = Snum.toCharArray();
        for(char num : charArray){
            if(num == '3') newStr += "Tic "; 
        }
        if(Snum.contains("3"))return newStr.trim();        
        else return Snum;
    }
    
    public String Divide3(int number){
        String Snum = ""+number;
        String rep = Replace3(number);
        if(number%3 == 0 && Snum.contains("3")) return rep += " Tic";
        else if(number%3 == 0) return "Tic";
        else return rep;
    }
    
    public String Replace5(int number){
        String Snum = ""+number;
        String newStr = "";
        char[] charArray = Snum.toCharArray();
        for(char num : charArray){
            if(num == '5') newStr += "Tac "; 
        }
        if(Snum.contains("5"))return newStr.trim();        
        else return Snum;
    }
    
     public String Divide5(int number){
        String Snum = ""+number;
        String rep = Replace5(number);
        if(number%5 == 0 && Snum.contains("5")) return rep += " Tac";
        else if(number%5 == 0) return "Tac";
        else return rep;
    }
     
    public String Replace7(int number){
        String Snum = ""+number;
        String newStr = "";
        char[] charArray = Snum.toCharArray();
        for(char num : charArray){
            if(num == '7') newStr += "Toe "; 
        }
        if(Snum.contains("7"))return newStr.trim();        
        else return Snum;
    }
    
     public String Divide7(int number){
        String Snum = ""+number;
        String rep = Replace7(number);
        if(number%7 == 0 && Snum.contains("7")) return rep += " Toe";
        else if(number%7 == 0) return "Toe";
        else return rep;
    }
    
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
    }
}
