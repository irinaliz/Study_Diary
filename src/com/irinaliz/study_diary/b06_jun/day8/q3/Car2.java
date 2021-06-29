package com.irinaliz.study_diary.b06_jun.day8.q3;

public class Car2 {

	 int speed ;
	 String carName;
	
	public  void SpeedUp() {
		speed ++;
	}
	
	public  void SpeedDown() {
		speed --;
		if(speed <= 0) {
			stop();
		}
		
	}
	public void stop() {
		speed = 0;
		
	}

}
