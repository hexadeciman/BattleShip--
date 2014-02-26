package Views;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Canvas extends JPanel{
	
	private int count;
	private Point coordinates = new Point(0, 0);
    private ArrayList<Point> coordinateList = new ArrayList<Point>();
    private int side;
    
    public Canvas(int n){
    	side = n;
    	setPreferredSize(new Dimension(1000, 1000));
    }
	
	  private void doDrawing(Graphics g) {

	        Graphics2D g2d = (Graphics2D) g;

	        g2d.setColor(Color.blue);
	        g2d.drawLine(381, 0, 381, 585);

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
	        matchRectangle(g, 5, 2);
	        Graphics2D g2 = (Graphics2D) g;

	        int count = side;
	        int size = 20;
	        g2.setColor(Color.black);
	        for( int i = 0; i < count; i ++)
	        {
	          for( int j = 0; j < count-10; j++)
	          {
	        	 //Rectangle grid = new Rectangle( 300 + i * size, 20 + j * size, size, size);
		         Rectangle grid = new Rectangle(i*size, j*size, size, size);
	        	 g2.draw(grid);
	        	             
	          }
	        }
	     

	        
	       } // paintComponent
	    
	    private void matchRectangle(Graphics g, int x, int y){
	    	int dy = getSize ().height;
	        int dx = getSize ().width;
	        //int mid_y = dy/2-y;
	        //int mid_x = dx/2-x;
	        
	        int mid_y=0;// = 20+x;
	        int mid_x=0;// = 20+y;
	        
	        for(int i=0; i<x-1; i++){
	        	mid_x = (mid_x + 20);
	        	for(int j=0; j<y-1; j++){
	        		mid_y = (mid_y + 20);
	        	}
	        }
	        
	    	g.setColor (Color.red);
	    	g.fillRect(mid_x, mid_y, 20, 20);
	    }
	    
	   
	    
	            
}	
	   
