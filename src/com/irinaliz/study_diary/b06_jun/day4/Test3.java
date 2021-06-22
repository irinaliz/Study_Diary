package com.irinaliz.study_diary.b06_jun.day4;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q1();
//		q2();
//		q3();
//		q4();
	}

	
	public static void q1() {
		int fine_dust = 70;
		String status = "";
		if ( fine_dust <= 30 ) {
			status = "좋음";
		} else if (fine_dust <=80) {
			status = "보통";
		} else if(  fine_dust <= 150) {
			status = "나쁨";
		} else {
			status = "매우 나쁨";
		}
		System.out.println(status);
	}
	
	public static void q2() {
		String blood_type = "A";
		String name = "홍길동";
		String msg = "";
		switch(blood_type) {
		case "A":
			msg ="마음속이 깨끗한 성격";
			break;
		case "B":
			msg ="털털한 구석이 있는 성격";
			break;
		case "O":
			msg ="언제나 발랄한 성격";
			break;
		case "AB":
			msg ="밝은 내일을 생각하는 성격";
			break;
		}
		System.out.println(name + "님의 혈액형은 " + blood_type + "이며 " + msg + " 입니다");
	}
	
	public static void q3() {
		int school_year = 1;
		System.out.println("나이 : 학년");
		for (int i = 8; i <= 13 ; i++) {
			System.out.println(i +"세 : " + "초" + school_year );
			school_year++;
		}
	}
	
	public static void q4() {
		int[] score = {90, 88, -30, 70};
		int sum = 0;
		int list = 1;
		for(int i = 0; i < score.length; i++) {
			if(score[i] > 0) {
				System.out.println(list +". " + score[i]);
				list ++;
				sum += score[i];
				
			}
		}
		System.out.println("합계 : " + sum);
	}
}
