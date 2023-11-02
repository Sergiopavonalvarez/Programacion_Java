package POO_Password;

import java.util.Scanner;

public class Password {
	private String pwd;
	private int fallos;
	

	
	
	public Password(String pwd) {
		this.pwd = pwd;
		this.fallos = 0;
	}
	
	public boolean login (String txt) {
		
		
		
		
		if (txt.equals(pwd)) {
			fallos=0;
			
			return true;
		}else {
			
			
			fallos++;
			return false;
			
		}
	}
	
	public int getFallos() {
		return fallos;
	}
	

}
