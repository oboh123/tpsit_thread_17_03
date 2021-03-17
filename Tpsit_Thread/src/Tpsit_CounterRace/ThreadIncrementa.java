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
public class ThreadIncrementa implements Runnable{ 
    
    Thread thr1 = new Thread();
    Counter contatatore = new Counter();
    
            
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                contatatore.incrementa();

                try {
                    thr1.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadIncrementa.class.getName()).log(Level.SEVERE, null, ex);
                }

                
              
            }
        }    
    
}
