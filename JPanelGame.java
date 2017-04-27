package UI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Num;

public class JPanelGame extends JPanel implements Runnable{
	
	public static final int REFRESH_TIME = 50;
	public Num [][] num;
	
	public JLabel [] jLabel;
	public jPanelFigure [] jPanelFigures;
	private Random random;
	public JPanelGame(Num [][]num){
		super();
		this.setLayout(new GridLayout(num.length, num.length));
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.num = num;
		jPanelFigures = new jPanelFigure[num.length*num.length];
		init();
		random = new Random();
	}
	
	
	
	public void init(){
	       int count = 0;
	       for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				//System.out.println(num[i][j].getNum()  +""+ String.valueOf(num[i][j].getNum()));
				jPanelFigures[count] = new jPanelFigure(num[i][j]);
				count++;
			}
		}
	       for (int i = 0; i < jPanelFigures.length; i++) {
			this.add( jPanelFigures[i]);
			System.out.println(i);
		}
	       //showJPanel(); 
	    }

	public void initThread(){
		new Thread(this).start();
	}
	
	public void showJPanel(){
		boolean flag = false;
		while(!flag){
			int pos = random.nextInt(jPanelFigures.length);
			if(jPanelFigures[pos].isActive()){
				jPanelFigures[pos].seeNum();
				flag = true;
				try {
					Thread.sleep(500);
					jPanelFigures[pos].hideNum();
				} catch (InterruptedException e) {
					
				}
			}
			
			
		}
		
		
	}
	
	public void captureEventKey(){
		boolean flag = false;
		while(!flag){
			
			int pos = random.nextInt(jPanelFigures.length);
			if(jPanelFigures[pos].isActive()){
				System.out.println("entro");
				jPanelFigures[pos].seeShow();
				flag = true;
				try {
					Thread.sleep(2000);
					jPanelFigures[pos].hideNum();
					jPanelFigures[pos].setShow(false);
				} catch (InterruptedException e) {
					
				}
			}
			
			
		}
	}
	
	public void verifyNum(int num){
		for (int i = 0; i < jPanelFigures.length; i++) {
			if(jPanelFigures[i].isShow()){
				if(jPanelFigures[i].getNum().getNum() == num){
					jPanelFigures[i].setActive(false);
					jPanelFigures[i].setBackgroundPane(Color.GREEN);
				}
				else{
					jPanelFigures[i].setActive(false);
					jPanelFigures[i].setBackgroundPane(Color.RED);
				}
			}
		}
	}
	
	  @Override    
	  public void run() {
	        while(true){
	           repaint();
	            try {
	            	Thread.sleep(500);
	            	showJPanel();
	            	captureEventKey();
	            } catch (InterruptedException ex) {
	            }
	        }
	    }
	
}
