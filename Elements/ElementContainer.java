package Elements;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import Lib.Tuple;
import Views.Canvas;


public class ElementContainer extends JPanel  implements MouseListener {
	public int posX;
	public int posY;
	public int sizeX;
	public int sizeY;
	public Color color;
	private int active;
	boolean side;
	Tuple posReal;
	public ElementContainer(int x, int y, int sx, int sy, Color col, boolean b){
		posX = x;
		posY = y;
		sizeX = x;
		sizeY = y;
		color = col;
		side = b;
		posReal = Canvas.matchRectangle(posX, posY);
        this.setOpaque(false);

		//this.setVisible(false);
		//this.setBackground(Color.BLUE);
		System.out.println("Debut");
		addMouseListener(this);
	}
	
	public int getRealPosX(){
		return posReal.x;
	}
	
	public int getRealPosY(){
		return posReal.y;
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(20,20);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(posX+" "+posY);
		if(Canvas.currentCard==1){
			this.setOpaque(true);
			this.active = 1;
			this.setBackground(Color.BLUE);
			Canvas.currentCard=0;
			return;
		}
		if(active==1){
			this.setBackground(Color.RED);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	
}
