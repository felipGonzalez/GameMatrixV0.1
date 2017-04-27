package models;

import java.util.Random;

public class Num {
	
	private int num;
	
	public Num(int range) {
		num =  new Random().nextInt(range);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
