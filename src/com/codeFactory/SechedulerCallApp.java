package com.codeFactory;

import java.util.Timer;

public class SechedulerCallApp {

	public static void main(String[] args) {

		Timer timer = new Timer();
		
		SechudulerMain schMain = new  SechudulerMain();
		timer.scheduleAtFixedRate(schMain, 0, 5000);
		
	}

}
