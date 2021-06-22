package com.irinaliz.study_diary.b06_jun.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		q1();
//		q2();
//		q3();
//		q4();
//		q6();
		q7();
//		q8();
//		q9();
//		q10();
//		q11();
		
	}

	
	public static void q1() {
		int price = 2000;
		if (price <= 1000 ) System.out.println (price+ "원은" + " 고가 입니다.");
		else System.out.println(price +"원은" + " 저가 입니다.");
	}
	
	public static void q2() {
		
		int number = 49;
		if(number == 0 ) number -= 10;
		else if (number % 2 ==0) number += 10;
		else if (number % 2 ==1) number += 20;
		
		System.out.println("값 : " + number);
	}
	
	public static void q3() {
		boolean toggle = false;
		
		if(toggle) 	toggle = false; 
		else toggle = true;
		
		System.out.println("toggle 값 : " + toggle);
	}
	
	public static void q4() {
		int a = 10;
		int b = 20;
		int speed = 0;
		
		if( a > b ) speed = 10;
		else if ( a < b ) speed = 20;
		else speed = 0;
		
		System.out.println("속도 : " + speed);
		
	}
	
	public static void q5() {
		Scanner scn = new Scanner (System.in);
		int admission = 10000;
		if ( scn.hasNextInt() ) {
			int i = scn.nextInt();
			if( i <= 13 ) System.out.println("손님 나이는 " + i +"세로 입장료는" + (admission*0.5) + "원 입니다");
			else if ( i >= 70) System.out.println("손님 나이는 " + i +"세로 입장료는" + (admission*0.75) + "원 입니다");
			else System.out.println("손님 나이는 " + i +"세로 입장료는" + admission + "원 입니다");
																				
		}
	}
	public static void q6() {
		for (int i = 1; i<=3 ; i++) {
			System.out.println("포도" + i + "송이");
		}
	}
	
	public static void q7() {
		
		for (int i= 1 ; i <= 9 ; i++) {

			System.out.print( "ㅁ");
			if(i%3==0) {
				System.out.println();
			}
		}
	}
	
	public static void q8() {
		
		for ( int i = 1; i <= 9; i ++) {
			System.out.print( (i+100) + " ");
			if(i%3==0) {
				System.out.println();
			}
		}
	}
	
	public static void q9() {
		
		for ( int i = 1; i <= 31; i ++) {
			System.out.print(i + "일 ");
			if(i%7==0) {
				System.out.println();
			}
		}	
	}
	

	
	public static void q10() {
		
		for ( int i = 1; i <= 31; i ++) {
			System.out.print((i <  10 ? "0" : "") +i + "일 ");
			if(i%7==0) {
				System.out.println();
			} 
		}
	}
	
	public static void q11() {
		int[] number = {10,20,30,40,50,60};
		int sum = 0;
		for (int i = 0; i < number.length; i ++) {
			sum += number[i];
		}
		System.out.println("값 : " + sum);
	}
}
