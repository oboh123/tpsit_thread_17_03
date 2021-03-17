/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tpsit_CounterRace;

/**
 *
 * @author informatica
 */
public class Counter {
    
    int contatore = 0;
    
    public void incrementa (){
        contatore++;
    }
    
    public void decrementa(){
        contatore--;
    }

    public Counter() {
    }
    
    public void stampaContatore(){
        
        System.out.println("Contatorre " + contatore);
    
    
    }
    
}
