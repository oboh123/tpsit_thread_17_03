/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tpsit_CounterRace;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class ThreadDecrementa implements Runnable{
    
    Thread thr1 = new Thread();
    Counter contatatore = new Counter();
    
            
        
        public void run() {
            for (int i = 0; i < 20000; i++) {
                contatatore.decrementa();
                try {
                    thr1.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadIncrementa.class.getName()).log(Level.SEVERE, null, ex);
                }

                
              
            }
        }      
    
}
