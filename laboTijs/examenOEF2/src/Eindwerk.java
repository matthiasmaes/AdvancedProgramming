/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tijs
 */
public class Eindwerk implements Comparable<Eindwerk> {
    public String titel;
    public int jaartal;
    public String opleiding;
    public Student student;
    
    public Eindwerk(String titel, int jaartal, String opleiding, Student student){
        this.titel = titel;
        this.jaartal = jaartal;
        this.opleiding = opleiding;
        this.student = student;
    }

    @Override
    public int compareTo(Eindwerk o) {
        if(!opleiding.equals(o.opleiding)) return this.opleiding.compareTo(opleiding);
        if(!student.familienaam.equals(o.student.familienaam)) return student.familienaam.compareTo(o.student.familienaam);
        return student.voornaam.compareTo(o.student.voornaam);
    }  
}
