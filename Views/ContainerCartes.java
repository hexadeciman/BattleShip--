package Views;

import javax.swing.JPanel;

public class ContainerCartes extends JPanel {
	ContainerCartes() {
		
		this.add(new Carte(1,"missile"));
		this.add(new Carte(2,"bombe"));
	}
	
}
