package com.irinaliz.study_diary.b06_jun.day8.q3;

public class Car_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car1.carName = "소나타";
		Car1.speed = 100;
		Car1.SpeedUp();
		Car1.SpeedUp();
		
		System.out.println("차 이름 : " + Car1.carName + " | 속도 : " + Car1.speed);
		Car1.stop();
		System.out.println("차 이름 : " + Car1.carName + " | 속도 : " + Car1.speed);
		
		
		
	}

}
