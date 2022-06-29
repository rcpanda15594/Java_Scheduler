package com.codeFactory;

import java.util.Date;
import java.util.TimerTask;

public class SechudulerMain extends TimerTask{
	
	Date current;
	int cnt =0;
	@Override
	public void run() {
		
		current = new Date();
		System.out.println("Current Date and time is :"+current);
		cnt++;
		if(cnt == 5){
			System.out.println("Exits....");
			System.exit(0);
		}
	}

}
