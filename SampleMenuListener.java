import java.util.regex.Pattern;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

class SampleMenuListener implements MenuListener {

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void menuDeselected(MenuEvent e) {
		//TODO!!!!!!!!	
		// regex: [\n\r].*text=\s*([^\n\r]*) \]]
		//Pattern pattern = Pattern.compile(arg0);
		
		
	}
	@Override
	public void menuSelected(MenuEvent e) {
		
	}
   
}
