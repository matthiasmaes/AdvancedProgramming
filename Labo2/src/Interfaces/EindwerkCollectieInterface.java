/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import DataEntities.*;
/**
 *
 * @author Peter
 */
public interface EindwerkCollectieInterface {

    Eindwerk[] getEindwerkenVanOpleiding(String opleiding);

    void verwijder(Eindwerk eindwerk);

    void voegToe(Eindwerk eindwerk);
    
}