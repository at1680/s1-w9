import java.awt.*;
import javax.swing.*;

public class Greetings extends JPanel {
	
   private int myWindowWidth;
   private int myWindowHeight;
	
   public Greetings() {
      this(300,400);
   }

   public Greetings(int width, int height){
      this.myWindowHeight=height;
      this.myWindowWidth=width;
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
   }
	
   public void paintComponent (Graphics g) {
      int h = this.getSize().height/2;
      int w = this.getSize().width/2;
      g.drawString ("Hi there!", 125, 125);	
      g.drawRect(100,100,100,50);
   }
}