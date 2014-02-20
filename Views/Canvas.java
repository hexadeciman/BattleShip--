package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.util.Random;

import javax.swing.JPanel;

public class Canvas extends JPanel{
	  private void doDrawing(Graphics g) {

	        Graphics2D g2d = (Graphics2D) g;

	        g2d.setColor(Color.blue);
	        g2d.drawLine(385, 0, 385, 550);


	       /* 
	        * vertical line  (top to bottom centered)
	        g2d.drawLine(385, 0, 385, 550);
	        * horizontal line  (left to right /2 centered)
	        g2d.drawLine(0, 275,385 , 275);
	        */
	        
	        
	    }

	    @Override
	    public void paintComponent(Graphics g) {
	        
	        super.paintComponent(g);
	        doDrawing(g);
	    }	
	    
}
