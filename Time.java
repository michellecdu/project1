import java.util.concurrent.TimeUnit;
import java.lang.Object;

public class Time { // timer for score

    public static void main(String[] args) throws InterruptedException {
		//start
        long StartTime = System.nanoTime();
		//task
        floatingTime();
		//end
        long targetTime = System.nanoTime();
		//time elapsed
        long output = targetTime - StartTime; 
        //System.out.println("Elapsed time in milliseconds: " + output / 1000000);        
        //pressed = //when the user presses it; actionListener stuff?
        //long elapsedTime = Math.abs(output - pressed);
        
    //}
    
   /* public void checkClick() {
   // can you write this */
     } 

    private static void floatingTime() throws InterruptedException {
        //Sleep 2 seconds
        TimeUnit.MILLISECONDS.sleep(8680);
        //how should it restart here
        TimeUnit.MILLISECONDS.sleep(1680);
        TimeUnit.MILLISECONDS.sleep(1590);
        TimeUnit.MILLISECONDS.sleep(1670);
        TimeUnit.MILLISECONDS.sleep(1670);
        TimeUnit.MILLISECONDS.sleep(390);
        TimeUnit.MILLISECONDS.sleep(2760);
        TimeUnit.MILLISECONDS.sleep(3160);
        TimeUnit.MILLISECONDS.sleep(1610);
        TimeUnit.MILLISECONDS.sleep(450);
        TimeUnit.MILLISECONDS.sleep(340);
        TimeUnit.MILLISECONDS.sleep(2470);
        TimeUnit.MILLISECONDS.sleep(3320);
        TimeUnit.MILLISECONDS.sleep(3200);
        TimeUnit.MILLISECONDS.sleep(2570);
        TimeUnit.MILLISECONDS.sleep(1670);
        TimeUnit.MILLISECONDS.sleep(19110);
        TimeUnit.MILLISECONDS.sleep(2310);
        TimeUnit.MILLISECONDS.sleep(790);
        TimeUnit.MILLISECONDS.sleep(2620);
        TimeUnit.MILLISECONDS.sleep(480);
        TimeUnit.MILLISECONDS.sleep(1450);
        TimeUnit.MILLISECONDS.sleep(790);
        TimeUnit.MILLISECONDS.sleep(710);
        TimeUnit.MILLISECONDS.sleep(3010);
        TimeUnit.MILLISECONDS.sleep(1480);
        TimeUnit.MILLISECONDS.sleep(1560);
        TimeUnit.MILLISECONDS.sleep(710);
        TimeUnit.MILLISECONDS.sleep(940);
        TimeUnit.MILLISECONDS.sleep(113890);
        TimeUnit.MILLISECONDS.sleep(3270);
        TimeUnit.MILLISECONDS.sleep(530);
        TimeUnit.MILLISECONDS.sleep(3100);
        TimeUnit.MILLISECONDS.sleep(1200);
        TimeUnit.MILLISECONDS.sleep(680);
        TimeUnit.MILLISECONDS.sleep(1760);
        TimeUnit.MILLISECONDS.sleep(790);
        TimeUnit.MILLISECONDS.sleep(1340);
        TimeUnit.MILLISECONDS.sleep(3320);
        TimeUnit.MILLISECONDS.sleep(1970);
        TimeUnit.MILLISECONDS.sleep(700);
        TimeUnit.MILLISECONDS.sleep(2890);
        TimeUnit.MILLISECONDS.sleep(61870);
        TimeUnit.MILLISECONDS.sleep(670);

    }
}
