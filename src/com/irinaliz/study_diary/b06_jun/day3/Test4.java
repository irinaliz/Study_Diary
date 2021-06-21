package com.irinaliz.study_diary.b06_jun.day3;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int a = 1;
//		while( a <= 5) {
//			System.out.println(a);
//			a++;
//		};
		
//		ex_while();
//		ex_for();
		ex_do_while();
		
	
		
		
	}
	
	public static void ex2() {
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		do{
            value = scan.nextInt(); // Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받습니다.
            System.out.println("입력받은 수 : " + value);  
        }while(value != 10);  // 입력받은 값이 10이 아닐 경우에는 계속 반복합니다.

        System.out.println("반복문 종료");
	
	}
	
	public static void q1() {
		
		for (int i = 5; i >= 1 ; i--) {
			System.out.print(i);
		}
	}
	
	public static void q2() {
		
		int[] months = {1, 3, 4, 5, 6, };
		for( int i = 0 ; i< months.length ; i ++) {
			System.out.println(months[i]);
		}
	}
	
	public static void q3() {
		int k = 0;
		do {
			System.out.println(k);
			k++;
		} while( k != 10); // do-while은 조건값이 false가 될때까지 반복한다. = 조건값이 true라면 계속 돌아간다는 뜻
	}
	
	public static void ex_do_while() {
		int[] months = {5,6,7,8};
		int a= 0;
		do {
			System.out.print(months[a] + "월 ");
			a ++;
		} while (months.length != a );
		System.out.println();
		int c=1;
		do {
			System.out.print(c +"반" + (c == 11 ? "" : ", "));
			c += 2;
		} while(c  <= 11);
		
	}
	
	
	public static void ex_for() {
		int [] month = {1,3,5,6,7,8};
		for ( int i = 0; i < month.length; i++) {
			System.out.print(month[i] + ( i != month.length ? "월 ": "월"));
		}
		System.out.println();
		
		for ( int i = 1; i <= 11 ; i +=2) {
			System.out.print(i +  (i != 11 ? "반, " :"반"));
			
		}
		
	}
	
	public static void ex_while() {
		int[] month = {1,3,5,7,9};
		int i = 0;
		while (  i < month.length) {
			System.out.println(month[i] + ( i != month.length ? "월 ": "월"));
			i++;
		}
	}
	
	
}
