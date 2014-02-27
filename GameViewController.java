import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.event.MenuKeyEvent;

//Views are in package Views
import Views.MainView;

public class GameViewController {
	MainView views ;
	GameViewController(MainView views){
		this.views = views;
	}
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("HOME")){
			
		}
		else if(command.equals("USER")){
			
		}
		else if(command.equals("CARTES")){
			
		}
		else if(command.equals("DECKS")){
			
		}
	}
	


}
