import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import Views.*;


public class Window extends JFrame implements ActionListener,ItemListener{

	Window(){
		runGUI();
	}
	public void runGUI(){
		this.setDefaultCloseOperation(3);
		//frame.pack();    
		
		JMenuBar bar = createBar();
		this.setJMenuBar(bar);
		ContainerGame cont = new ContainerGame(this.getContentPane());
		this.add(cont);
		this.setSize(927, 749);
		this.setVisible(true);		

		//this.pack();
		/*		GridLayout experimentLayout = new GridLayout(2,3);
		this.setLayout(experimentLayout);
	*/
		//Canvas c = new Canvas();
		//Canvastest2 c2 = new Canvastest2();

		//this.add(c);
		//this.add(c2);

		/*
		 * HERE WE PUT CODE FOR MAIN VIEWS 
		 */
		
		
	}
	
	private JMenuBar createBar(){
		//Where the GUI is created:
		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;
		
		//Create the menu bar.
		menuBar = new JMenuBar();

		//Build the first menu.
		menu = new JMenu("Home");
		menu.setName("ddd");
		//VK_A => key released
        menu.setMnemonic(KeyEvent.VK_M);
        menu.addMenuListener(new SampleMenuListener());
		menuBar.add(menu);
		

		//Build second menu in the menu bar.
		menu = new JMenu("Profile");
		menu.setName("asdasd");
		//VK_A => key released
        menu.setMnemonic(KeyEvent.VK_M);
        menu.addMenuListener(new SampleMenuListener());
		menuBar.add(menu);
		
		/*
		//a group of JMenuItems
		menuItem = new JMenuItem("USER",KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);

		menu.add(menuItem);
		menuItem = new JMenuItem("CARTES",KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);

		menu.add(menuItem);
		menuItem = new JMenuItem("DECKS",KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		menu.add(menuItem);
       */
		
		return menuBar;
	}
	public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}
	
}
