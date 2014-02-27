package Views;


import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import Elements.ElementContainer;
import Lib.Paquets;


public class ContainerGame extends JPanel{
	Canvas can;
    public static ArrayList<ElementContainer> ShipList = new ArrayList<ElementContainer>();
    private ArrayList<String> listboat;
    private ArrayList<String> listcards;
	
	public ContainerGame(Container pane){
		GridBagConstraints c = new GridBagConstraints();
		pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		listboat = new ArrayList<String>();
		listcards = new ArrayList<String>();

		c.fill = GridBagConstraints.BOTH;

		pane.setLayout(new GridBagLayout());
		

	    can = new Canvas(40);
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
	    
	    
	    
	    //JButton button = new JButton("Button 2");
	    //c.fill = GridBagConstraints.HORIZONTAL;
	    //c.fill = GridBagConstraints.RELATIVE;
	    c.gridx = 0;
	    c.gridy = 2;
	    c.gridwidth=3;
	    pane.add(new ContainerCartes(), c);
	    //addShips();
	    
	}
	
	
	private void doAction(String paquet){
		Paquets p = Paquets.valueOf(paquet);
		switch(p){
			case HELLO:
				hello();
				break;
			case NEWGAME:
				newGame();
				break;
			case NEWCARD:
				newCard();
				break;
			case INFOBOAT:
				infoboat();
				break;
			case UPDATE:
				updateGame();
				break;
			case CARDACTION:
				cardaction();
				break;
			case BYE:
				System.exit(0);
				break;
			default:
				break;
		}
	}
	
	private void cardaction() {
		// TODO Auto-generated method stub
		
	}


	private void updateGame() {
		// TODO Auto-generated method stub
		
	}


	private void infoboat() {
		
		
		
	}


	private void newCard() {
		// TODO Auto-generated method stub
		
	}


	private void newGame() {
		// TODO Auto-generated method stub
		System.out.println(getMacAddress());
	}

	private String getMacAddress(){
		try {
		    InetAddress ip = InetAddress.getLocalHost();
		    Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
		    while(networks.hasMoreElements()) {
		      NetworkInterface network = networks.nextElement();
		      byte[] mac = network.getHardwareAddress();

		      if(mac != null) {

		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < mac.length; i++) {
		          sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
		        }
		        return sb.toString();
		      }
		    }
		  } catch (UnknownHostException e) {
		    e.printStackTrace();
		  } catch (SocketException e){
		    e.printStackTrace();
		  }
		return null;
	}
	private void hello() {
		// TODO Auto-generated method stub
		
		String mac = getMacAddress();
		//connexion au serveur
		
	}


	private int getRandom(int min, int max){
		Random random = new Random();
		int randomNum =  random.nextInt(max);
		return randomNum;
	}

	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	}
	
	public void addShips(int x, int y){
		ElementContainer s = new ElementContainer(x,  y, 1, 1, Color.red, true);
		ShipList.add(s);
		//This is for adding Ships
		/*for(int j = 0; j<5; j++){
			int x = getRandom(1,40);
			int y = getRandom(1,30);
			int sizeY = getRandom(1,3);
			
		}*/
	}
}
