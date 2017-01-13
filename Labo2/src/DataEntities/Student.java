/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataEntities;

/**
 *
 * @author MatthiasMaes
 */
public class Student {
    private final String voornaam;
    private final String achternaam;
    
    public Student(String voornaam, String achternaam){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }
    
    public String getVoornaam(){
        return this.voornaam;
    }
    
    public String getAchternaam(){
        return this.achternaam;
    }
    
}
