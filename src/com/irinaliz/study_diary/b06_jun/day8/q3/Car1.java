package com.irinaliz.study_diary.b06_jun.day8.q3;

public class Car1 {
	static int speed ;
	static String carName;
	
	public static void SpeedUp() {
		speed ++;
	}
	
	public static void SpeedDown() {
		speed --;
		if(speed <= 0) {
			stop();
		}
		
	}
	public static void stop() {
		speed = 0;
		
	}

}
