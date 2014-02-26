package Views;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ContainerGame extends JPanel{
	public ContainerGame(Container pane){
		GridBagConstraints c = new GridBagConstraints();
		pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		c.fill = GridBagConstraints.BOTH;

		pane.setLayout(new GridBagLayout());
		

	    Canvas can = new Canvas(40);
	    //c.ipady = 500;      //make this component tall
	    //can.paintComponent();

	    c.weightx = 0.65;
	    c.weighty = 3.2;

	    c.gridx = 1;
	    c.gridy = 0;

	    pane.add(can, c);
	    
	    //JTextField field = new JTextField("Type something........", 0);
	    JTextArea field = new JTextArea(5, 20);
	    field.setEditable(false);
	    //field.setPreferredSize( new Dimension( 200, 24 ) );
		//JButton button = new JButton("Button 1");
		//c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.2;
	    c.weighty = 0.7;

	    c.gridx = 0;
	    c.gridy = 0;
	    pane.add(field, c);
	    
	    
	    
	    JButton button = new JButton("Button 2");
	    //c.fill = GridBagConstraints.HORIZONTAL;
	    //c.fill = GridBagConstraints.RELATIVE;
	    c.gridx = 0;
	    c.gridy = 2;
	    c.gridwidth=3;
	    pane.add(button, c);
	    
	}
}
