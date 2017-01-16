/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NaamGenerator { 
    
    private final Random random ;
    private List<String> firstNamesList;
    private List<String> lastNamesList;
    private List<String> titlesList;
    private final String wordsFile = "wordsEn.txt";
    private final String firstNamesFile = "first-names.txt";
    private final String lastNamesFile = "names.txt";
    
    public NaamGenerator(){
        this.random = new Random(1);
        initialize();
    }
    
    private void initialize(){
        this.titlesList = readFile(wordsFile);
        this.firstNamesList = readFile(firstNamesFile);
        this.lastNamesList = readFile(lastNamesFile);
    } 

    private List<String> readFile(String fileName) {
        Scanner in;
        List<String> wordList = new ArrayList<>();
        try {
            in = new Scanner(new FileReader(fileName));
            for(int i =0; i<10 ; i++){
                String text = in.next();
                wordList.add(text);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NaamGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return wordList;
    }
    
    public String getRandomWordFromList(List<String> wordList){        
        int randomInt = random.nextInt(wordList.size());
        return wordList.get(randomInt);        
    }
    
    public String makeTitleWithRandomWords( int numberOfRandomWords){
        String randomWords = "";
        for (int i=0; i< numberOfRandomWords; i++){
            randomWords += getRandomWordFromList(titlesList) + " ";
        }
        return randomWords;
    }

    public int getRandomYear(){        
        Random r = new Random();
        int Low = 2015;
        int High = 2017;
        return r.nextInt(High-Low) + Low;
    }
    
    public String getRandomFirstName(){        
        int randomInt = random.nextInt(firstNamesList.size());
        return firstNamesList.get(randomInt);        
    }
    
    public String getRandomName(){        
        int randomInt = random.nextInt(lastNamesList.size());
        return lastNamesList.get(randomInt);        
    }
    
    public String getRandomNum(){
        String str = "rua"; 
        char[] charArray = str.toCharArray();
        
        int randomInt = 2000 + (int)(Math.random() * 3000);
        char karakter = charArray[random.nextInt(charArray.length)];
        
        return karakter + "" + randomInt;
    }
    
    public List<String> getFirstNamesList() {
        return firstNamesList;
    }

    public List<String> getLastNamesList() {
        return lastNamesList;
    }

    public List<String> getTitlesList() {
        return titlesList;
    }
}