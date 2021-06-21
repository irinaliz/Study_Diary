package com.irinaliz.study_diary.b06_jun.day3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		for ( int i = 0; i <= 5; i++) {
			System.out.println("사과");
		}
		
		for (int i = 1 ; i <= 5 ; i += 2) {
			System.out.println(i);
		}
		
		for ( int i= 11; i<= 15 ; i++) {
			System.out.print("제" + i + "회 ");
		}
		System.out.println();
		

		System.out.print("부서번호 : ");
		for (int i = 10; i <= 50; i += 10) {
			System.out.print(i + " ");
		}
*/
		System.out.println();
		/*
		
		for ( int front = 1 ; front <= 9 ; front++) {
			for (int back = 1; back <= 9 ; back++) {
				System.out.println(front + " x " + back + " = " + (front*back));
			}
		}
		*/
		/*
		
		Scanner scn = new Scanner (System.in);
		System.out.print("숫자 입력 앙망 >>");
		if (scn.hasNextInt()) {
			int dan = scn.nextInt();
			for(int i = 1; i<= 9; i++ ) {
				System.out.println(dan + "x" + i + "=" + (dan*i));
			}
		}
		*/
		
		for(int a= 1; a<=2; a++) {
			for(int b=1; b<=5; b++) {
				System.out.print("*");
			}
			if(a==1) {
				System.out.println();
			}
		}
		
		
		for(int i = 50; i >= 41 ; i--) {
			System.out.println(i);
		}
	}

}
