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
public class Main {
    
    public static void main(String[] args) throws InterruptedException{
        
        Counter contatore = new Counter();
        
        Thread thr1 = new Thread (new ThreadIncrementa());
        Thread thr2 = new Thread (new ThreadDecrementa());

        thr1.start(); //Faccio partire il thread
        thr2.start(); //Faccio partire il thread       

        thr1.join(); //Attende il completamento
        thr2.join(); //Attende il completamento
        
        contatore.stampaContatore();
        
        
        
        
        
        
        
    }
    
}
