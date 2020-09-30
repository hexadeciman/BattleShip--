package Views;
//These is amazing code

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics3D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JPanel;

import Elements.ElementContainer;
import Lib.Tuple;

public class Canvas extends JPanel{
	
	private int count;
	private Point coordinates = new Point(0, 0);
    private int side;
    public static int sizeSquare;
    public static int currentCard;
    public Canvas(int n){
    	Canvas.currentCard=0;
    	side = n;
    	setPreferredSize(new Dimension(1000, 1000));
    	sizeSquare = 20;
    	setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

    	for(int row = 0; row<n; row++){
    		for(int col = 0; col<(n/4)*3;col++){
    			gbc.gridx = row;
    			gbc.gridy = col;
    			ElementContainer e = new ElementContainer(row, col, 1, 1, Color.BLACK, true);
    	    	add(e,gbc);
    		}
    	}
    }

		  private void drawGrid(Graphics g, int size){
			  Graphics2D g2d = (Graphics2D) g;
		        int count = side;
			  g.setColor(Color.black);
		        for( int i = 0; i < count; i ++)
		        {
		          for( int j = 0; j < count-10; j++)
		          {
			         Rectangle grid = new Rectangle(i*size, j*size, size, size);
		        	 g2d.draw(grid);
		        	             
		          }
		        }

		        g2d.setColor(Color.blue);
		        g2d.drawLine(381, 0, 381, 585);
		  }
	  
	    @Override
	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        displayShips(g);
	        drawGrid(g,sizeSquare);
	        repaint();
	    } // paintComponent
	    
	    static public Tuple matchRectangle(int x, int y){
	        int realY=0;
	        int realX=0;
	        //System.out.print(x+" "+y);
	        realX =  (x-1)*sizeSquare;
	        realY = (y-1)*sizeSquare;
	        //System.out.println(" -> "+realX+" "+realY);

	        Tuple posReal = new Tuple(realX,realY);
	        return posReal;
	    }
	    
		public void displayShips(Graphics g){
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;

			for(ElementContainer s: ContainerGame.ShipList){
				
				g2.setColor(s.color);
				g2.fillRect(s.getRealPosX(),s.getRealPosY(),sizeSquare, sizeSquare);
			}
			g2.fillRect(740, 280, 20, 20);
			
			
			
			//ElementContainer s = new ElementContainer(x,  y, 1, sizeY, Color.red, true);
			//add(s, 0,0);
		}
	    
	            
}	
	   
