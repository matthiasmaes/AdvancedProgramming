/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tijs
 */
public class Student {
    public String voornaam;
    public String familienaam;
    public String studentnummer;
    
    public Student(String voornaam, String familienaam, String studentnummer){
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.studentnummer = studentnummer;
    }
    
     public Student(String voornaam, String familienaam){
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }
     
    public void SetStudentNr(String studentNr){
        this.studentnummer = studentNr;
    }
}
