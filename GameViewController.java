import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Views are in package Views
import Views.MainView;

public class GameViewController implements ActionListener {
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
