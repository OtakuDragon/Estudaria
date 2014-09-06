package snake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class DrawPane extends JPanel{
    public void paintComponent(Graphics g){
      //draw on g here e.g.
       g.fillRect(0, 0, 800, 600);
       g.setColor(Color.GREEN);
       g.fillRect(5, 5, 10, 10);
    }
    
    public void update(Graphics g){
    	 g.setColor(Color.GREEN);
    	g.fillRect(5, 50, 10, 10);
    	
    	
    }
    
 }
