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
/**
 *
 * @author MatthiasMaes
 */
public class EindwerkCollectie implements EindwerkCollectieInterface {
     
    private final List<Eindwerk> eindwerkCollectie;
    
    public EindwerkCollectie(){
        this.eindwerkCollectie = new ArrayList<>();
    }
    
    public List<Eindwerk> test(){
        return this.eindwerkCollectie;
    }
    
    
    //Comparator<Eindwerk> byName = (Eindwerk e1, Eindwerk e2) -> e1.getRichting().compareTo(e2.getRichting());
    
    public Eindwerk[] getEindwerkenVanOpleiding(String opleiding) {
       List<Eindwerk> EindwerkArray = new ArrayList<>();
       this.eindwerkCollectie.stream().filter((eindwerk) -> (eindwerk.getRichting().equals(opleiding))).sorted((e1, e2) -> e1.compareTo(e2)).forEachOrdered((eindwerk) -> {EindwerkArray.add(eindwerk);});
        return  EindwerkArray.toArray().length == 0 ? null : EindwerkArray.toArray(new Eindwerk[0]);
    }

    public void verwijder(Eindwerk eindwerk){
        this.eindwerkCollectie.remove(eindwerk);
    }

    public void voegToe(Eindwerk eindwerk){
        if (!this.eindwerkCollectie.contains(eindwerk)) this.eindwerkCollectie.add(eindwerk);
    }
}
