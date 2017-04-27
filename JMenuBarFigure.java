package UI;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * crea el menu de opciones con sus items
 * @author Felipe Gonzalez
 *
 */
public class JMenuBarFigure extends JMenuBar{

	public JMenu jMenuArchive;
	
	public JMenuItem jItemExit;
		
	public JMenuBarFigure() {
		init();
		setShortcut();
	}
	/**
	 * 
	 * @param lenguage
	 */
	public void init(){
		this.jMenuArchive = new JMenu("archive");
		this.jItemExit = new JMenuItem("exit");
		this.add(jMenuArchive);
		
		
		this.jMenuArchive.addSeparator();
		this.jMenuArchive.add(jItemExit);
		
		
	}
	/**
	 * agrega los atajos
	 */
	public void setShortcut(){
		this.jItemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		

	}
	
}
