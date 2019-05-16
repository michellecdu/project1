import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
public class Scoreboard extends JPanel 
{
   //display
   private JLabel scoreboard;
   public Scoreboard() {
      setLayout(new BorderLayout());
      scoreboard = new JLabel("Score: " + score );//add scorelater
      scoreboard.setForeground(new Color(50, 100, 255)) ;
      scoreboard.setFont(new Font("Sans Serif", Font.BOLD, 20));
      add(scoreboard);
      add(scoreboard, BorderLayout.SOUTH);
   }

}
