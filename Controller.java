package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import UI.JFrameGame;
import UI.NumUI;
import models.Num;
import models.Tool;

public class Controller implements ActionListener, KeyListener{
	
	private JFrameGame frameGame;
	private String caracter;
	private Tool tool;
	public Controller () {
		frameGame = new JFrameGame(getFiguresNum());
		init();
		caracter = "";
		tool = new Tool();
	}
	
	public Num [][] getFiguresNum() {
		Num [][] num = new Num[3][3]; 
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				num[i][j] = new Num(9);
			}
			
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.println(i+1 + "  "+ num[i][j].getNum());
			}
			
		}
		return num;
	}
	
	public void init(){
		frameGame.jMenuBarFigure.jItemExit.addActionListener(this);
		frameGame.addKeyListener(this);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frameGame.jMenuBarFigure.jItemExit){
			frameGame.dispose();
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		caracter = KeyEvent.getKeyText(e.getKeyCode());
		System.out.println("carapter selecionado   " + caracter);
		if(tool.getValidationInt(caracter)){
			System.out.println("captura evento del teclado   " + caracter);
			frameGame.jPanelGame.verifyNum(Integer.parseInt(caracter));
		}	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
