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
public class Eindwerk {
    private final String titel;
    private final int jaar;
    private final String richting;
    private final Student student;
    
    public Eindwerk(String titel, int jaar, String richting, Student student){
        this.titel = titel;
        this.jaar = jaar;
        this.richting = richting;
        this.student = student;
    }
    
    public String getTitel(){
        return this.titel;
    }
    
    public int getJaar(){
        return this.jaar;
    }
    
    public String getRichting(){
        return this.richting;
    }
    
    public Student getStudent(){
        return this.student;
    }
    
}
