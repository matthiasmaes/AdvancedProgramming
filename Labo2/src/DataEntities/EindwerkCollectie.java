/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataEntities;
import interfaces.EindwerkCollectieInterface;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
/**
 *
 * @author MatthiasMaes
 */
public class EindwerkCollectie implements EindwerkCollectieInterface {

    SortedMap<String, SortedSet<Eindwerk>> eindwerkCollectie;

    
    public SortedMap<String, SortedSet<Eindwerk>> test(){
        return this.eindwerkCollectie;
    }
    
    public EindwerkCollectie(){
        this.eindwerkCollectie = new TreeMap<String, SortedSet<Eindwerk>>(); 
    }

    
    public Eindwerk[] getEindwerkenVanOpleiding(String opleiding) {
        
        return this.eindwerkCollectie.get(opleiding) == null ? null : this.eindwerkCollectie.get(opleiding).toArray(new Eindwerk[0]);
    }

    public void verwijder(Eindwerk eindwerk){
        this.eindwerkCollectie.get(eindwerk.getRichting()).remove(eindwerk);
        if (this.eindwerkCollectie.get(eindwerk.getRichting()).isEmpty()) {
            this.eindwerkCollectie.replace(eindwerk.getRichting(), null);
        }
        
        
    }

    public void voegToe(Eindwerk eindwerk){  
        if (!this.eindwerkCollectie.keySet().contains(eindwerk.getRichting())) this.eindwerkCollectie.put(eindwerk.getRichting(), new TreeSet<Eindwerk>());       
        this.eindwerkCollectie.get(eindwerk.getRichting()).add(eindwerk);
        System.out.println();
    }
}