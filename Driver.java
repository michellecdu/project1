import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Driver extends Display
  {
  public static void main(String[] args) throws Exception
   {
      JFrame frame = new JFrame("Frozen Dance Dance Revolution");
      frame.setSize(600, 600);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Scoreboard());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton b=new JButton("START");  
      frame.add(b, BorderLayout.NORTH);
      b.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
            Sound.play("Frozen - Do You Want to Build a Snowman.wav");
        }
      });    
      b.setFocusable(false);
      Display m = new Display();
         frame.add(m);        
         m.timer.start();
         frame.setVisible(true);
         while (true) {
            long startTime = System.currentTimeMillis();
            TimeUnit.MILLISECONDS.sleep(4000);
            //System.out.println(System.currentTimeMillis() - startTime);
            m.setY(1000);
            m.changeArrow();
            m.timer.restart();
         }
         
   } 
}