
import java.util.ArrayList;
import static java.util.Arrays.sort;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tijs
 */
public class EindwerkCollectie implements EindwerkCollectieInterface {
    /****dubbele lijst per richting***/
    public List<ArrayList<Eindwerk>> eindwerkcollectie;
    
    public EindwerkCollectie(){
        this.eindwerkcollectie = new ArrayList<ArrayList<Eindwerk>>();
    }
    
    /****enkele list****************************************************************************************************
    public List<Eindwerk> eindwerkcollectie;

    public EindwerkCollectie(){
        this.eindwerkcollectie = new ArrayList<Eindwerk>();
    }
    *********************************************************************************************************************/
   
    @Override
    public Eindwerk[] getEindwerkenVanOpleiding(String opleiding) {
        
        /****dubbele lijst per richting***/
        for(int i = 0; i<eindwerkcollectie.size(); i++){
            if(!eindwerkcollectie.get(i).isEmpty() && eindwerkcollectie.get(i).get(0).opleiding.equals(opleiding)){
                Eindwerk[] temp;
                temp = eindwerkcollectie.get(i).toArray(new Eindwerk[eindwerkcollectie.get(i).size()]);
                sort(temp);
                return temp;
            }
        }
        return null;
        
        /****enkele list****************************************************************************************************
        List<Eindwerk> newList = new ArrayList<Eindwerk>();
        for(Eindwerk ew : eindwerkcollectie){
            if(ew.opleiding.equals(opleiding) && !newList.contains(ew))newList.add(ew);
        }
        Eindwerk[] result = newList.toArray(new Eindwerk[newList.size()]);
        sort(result);
        
        if(result.length == 0) return null;
        return result;
        *********************************************************************************************************************/
    }

    @Override
    public void verwijder(Eindwerk eindwerk) {
        /****enkele list****************************************************************************************************
        this.eindwerkcollectie.remove(eindwerk);
        *********************************************************************************************************************/
        
        /****dubbele lijst per richting***/
        for(int i = 0; i<eindwerkcollectie.size(); i++){
            if(!eindwerkcollectie.get(i).isEmpty() && eindwerkcollectie.get(i).get(0).opleiding.equals(eindwerk.opleiding)){
                if (this.eindwerkcollectie.get(i).contains(eindwerk)) this.eindwerkcollectie.get(i).remove(eindwerk);
                return;
            }
        }
    }

    @Override
    public void voegToe(Eindwerk eindwerk) { 
        /****enkele list****************************************************************************************************
        if (!this.eindwerkcollectie.contains(eindwerk)) this.eindwerkcollectie.add(eindwerk);
        *********************************************************************************************************************/
        
        /****dubbele lijst per richting***/
        for(int i = 0; i<eindwerkcollectie.size(); i++){
            if(!eindwerkcollectie.get(i).isEmpty() && eindwerkcollectie.get(i).get(0).opleiding.equals(eindwerk.opleiding)){
                if (!this.eindwerkcollectie.get(i).contains(eindwerk)) this.eindwerkcollectie.get(i).add(eindwerk);
                return;
            }
        }
        
        ArrayList<Eindwerk> ewl = new ArrayList<>();
        ewl.add(eindwerk);
        eindwerkcollectie.add(ewl);
    } 
}
