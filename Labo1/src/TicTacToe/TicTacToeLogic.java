/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.util.Arrays;

/**
 *
 * @author MatthiasMaes
 */
public class TicTacToeLogic {
    
    
    public void ReplaceExactNumber(TicTacToeEntity TTT){
        int index = 0;
        for (int intToTest : TTT.getOriginalArray()) {
            if ((intToTest + "").length() > 1) {
                // Case if number contains more than one digit
                String partialOutput = "";
                for (char c : (intToTest + "").toCharArray()) if(TTT.getSpecials().keySet().contains(Integer.parseInt(c + "")))  partialOutput += TTT.getSpecials().get(Integer.parseInt(c + "")).toString() + " ";                               
                TTT.setResultArray(index, partialOutput.isEmpty() ? Integer.toString(intToTest) : partialOutput);
                
            } else  {
                // Case if number contains one digit
                if(TTT.getSpecials().keySet().contains(intToTest)){
                    TTT.setResultArray(index, TTT.getSpecials().get(intToTest).toString());
                } else {
                    // Case if number does not match specials (value copied to result)
                    TTT.setResultArray(index, Integer.toString(intToTest));
                }
            }            
            index++;
        }
    }
    
    
    public void ReplaceDevider(TicTacToeEntity TTT) {
        int index = 0;
        for (int intToTest : TTT.getOriginalArray()) {
            
            
            for (Object devider: TTT.getSpecials().keySet()) {
                if (intToTest % (int)devider == 0) {
                    TTT.setResultArray(index, TTT.getSpecials().get(devider).toString());
                }
                
                
            }
            
            index++;
        }
    }
}
