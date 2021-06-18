package com.irinaliz.study_diary.b06_jun.day2;

import java.util.Scanner;

public class Test4_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("점수입력 >> ");
		while(!scan.hasNextBoolean()) {
			int score = scan.nextInt();
			System.out.println(score + "점");
		}
		*/
		int emp_A_year = 0;
		boolean check = false;
		if(scan.hasNextInt()) {
			emp_A_year = scan.nextInt();
			check = true;
		} else {
			System.out.println("잘못된 기입입니다. 숫자를 입력해주세요");
			 check = false;
		}
		
		String str = "";
		if(emp_A_year >=15 ) str = "특급";
		 else if ( emp_A_year >= 10) str = "고급";
		 else if (emp_A_year >= 6) str = "중급";
		 else str = "초급";
		
		if(check) System.out.println("A 사원의 년차는 " + emp_A_year + "년으로 " + str + "입니다." );
		
		Scanner scan1 = new Scanner(System.in);
		String gender = "";
		String who = "";
		gender = scan1.nextLine();
		
		if(gender.equals("M")) {
			who = "남성";
		} else if(gender.equals("F")) {
			who = "여성";
		} else {
			who = "잘못된 코드";
		}
		System.out.println("결과) A씨의 성별 코드는 "+ gender + "로 " + who+"입니다" );
		
		
	}

}
