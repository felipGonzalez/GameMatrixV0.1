package UI;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import models.Num;

public class JFrameGame extends JFrame{

	public static final int WIDTH_APP = 1000;
	public static final int HEIGHT_APP = 700;
	public JMenuBarFigure jMenuBarFigure;
	public JPanelGame jPanelGame;
	
	public JFrameGame( Num [][] num){
		super();
		this.setLayout(new BorderLayout());
		jMenuBarFigure = new JMenuBarFigure();
		jPanelGame = new JPanelGame(num);
		init();
	}
	
	public void init(){
		this.setSize(WIDTH_APP, HEIGHT_APP);
		//this.add(jPanelPeople);
		this.setLocationRelativeTo(null);
		this.add(BorderLayout.NORTH, jMenuBarFigure);
		this.add(BorderLayout.CENTER,jPanelGame);
		this.setResizable(false); 
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.jPanelGame.initThread();
	}
	
}
