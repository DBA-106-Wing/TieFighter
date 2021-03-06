
package tiefighter;

import appboot.LARVABoot;
import java.util.concurrent.TimeUnit;


public class Practica3 {
    public static void main(String[] args) throws InterruptedException {
        LARVABoot connection = new LARVABoot();
        
        connection.Boot("isg2.ugr.es", 1099);
        
        connection.launchAgent("106-CORELLIAN-1", Practica3Corellian.class);
        
        
        connection.launchAgent("106-CORELLIAN-0", Practica3Corellian.class);
        
        
        connection.launchAgent("106-TIEFIGHTER-1", Practica3TieFighter.class);
        
        
        connection.launchAgent("106-TIEFIGHTER-0", Practica3TieFighter.class);
        
        
        
        
        
        
        
                
        connection.launchAgent("106-DESTROYER-1", Practica3Destroyer.class);
        
        connection.WaitToShutDown();
       
    }
    
}
