import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import Views.ContainerGame;


public class ConnectWindow extends JFrame {
	JPanel j ;
	JButton b;
	public ConnectWindow() {
		this.setDefaultCloseOperation(3);
		this.setSize(927, 749);
		j= new JPanel();
		b = new JButton("Start");
		b.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				Window w = new Window();
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		j.add(b);
		this.add(j);
		this.setVisible(true);	
	}
	
}
