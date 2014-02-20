package Views;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ContainerGame extends JPanel{
	public ContainerGame(Container pane){
		GridBagConstraints c = new GridBagConstraints();
		pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		c.fill = GridBagConstraints.BOTH;

		pane.setLayout(new GridBagLayout());
		

	    Canvas can = new Canvas();
	    //c.ipady = 500;      //make this component tall
		

	    c.weightx = 1;
	    c.weighty = 4;

	    c.gridx = 1;
	    c.gridy = 0;

	    pane.add(can, c);
	    
		
		JButton button = new JButton("Button 1");
		//c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.2;
	    c.weighty = 0.7;

	    c.gridx = 0;
	    c.gridy = 0;
	    pane.add(button, c);
	    
	    
	    
	    button = new JButton("Button 2");
	    //c.fill = GridBagConstraints.HORIZONTAL;
	    //c.fill = GridBagConstraints.RELATIVE;
	    c.gridx = 0;
	    c.gridy = 2;
c.gridwidth=3;
	    pane.add(button, c);
	    
	}
}
