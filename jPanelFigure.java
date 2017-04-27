package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Num;

public class jPanelFigure extends JPanel{

	private JLabel jLabel;
	private Num num;
	private boolean show; 
	private boolean active;
	public jPanelFigure(Num num) {
		this.num = num;
		this.setLayout(new BorderLayout());
		jLabel = new JLabel();
		this.add(BorderLayout.CENTER, jLabel);
		show = false;
		active = true;
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
	}
	
	
	
	public boolean isShow() {
		return show;
	}



	public void setShow(boolean show) {
		this.show = show;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}

	public void setBackgroundPane(Color color){
		this.setBackground(color);
	}

	public void hideNum(){
		jLabel.setText("");
	}
	
	public void seeNum(){
		if(active){
			jLabel.setText(String.valueOf(num.getNum()));
			jLabel.setHorizontalAlignment(JLabel.CENTER);
			jLabel.setVerticalAlignment(JLabel.CENTER);
		}
	}
	
	
	
	public Num getNum() {
		return num;
	}



	public void setNum(Num num) {
		this.num = num;
	}



	public void seeShow(){
		this.show = true;
		if(show){
			jLabel.setText("?");
			jLabel.setHorizontalAlignment(JLabel.CENTER);
			jLabel.setVerticalAlignment(JLabel.CENTER);
		}
	}
	
	
}
