package com.irinaliz.study_diary.b06_jun.day7;

import java.util.Calendar;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		//A조 이보민 쪽지시험 6월 25일 금요일
		
		//------- 1번 문제
		for ( int i = 1; i<12 ; i += 3) {
			System.out.print(i+"월 ");
		}
		
		int a = 1;
		
		System.out.println();
		
		while ( a < 12) {
			System.out.print(a + "월 ");
			a+= 3;
		}
		
		// -------- 2번 문제

		System.out.println();
		int time = 10;
		System.out.println("지금은 " +(time < 12 ? "오전" : "오후") +" 입니다.");
		
		
		// -------- 3번 문제
		System.out.println();
		
		for(int i = 1; i < 17; i++) {
			if ( i%3 ==0) {
				System.out.println(i);
			}
		}
		
		//------- 4번 문제
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(i+100 + " ");
			if(i%3==0) {
				System.out.println();
			}
		}
		
		//----- 5번 문제
		
		System.out.println();
		String time2 = "13:50";
		int hour = Integer.parseInt(time2.split(":")[0]);
		int min = Integer.parseInt(time2.split(":")[1]);
		
		System.out.println((hour < 12 ? "오전 ":"오후 " ) + (hour <12 ? hour : hour-12) + "시 " + min + "분입니다.");
		
		
		//------- 6번 문제
		System.out.println();
		
		String[][] score = {{"영어", "수학" , "과학" , "체육" , "국어"} , {"90","88","75","55","95"}};
		
		for(int i = 0; i < score[0].length ; i ++) {
			
			int num = Integer.parseInt(score[1][i]);
			String rank = (num >= 90 ? "A" : (num >= 80 ? "B" : (num >= 70 ? "C" : (num >= 60 ? "D" :"F"))));
			System.out.println(score[0][i] + ":" +rank);
			
		}
		
		// ----- 7번문제
		System.out.println();
		
		int[] grades = { 70,80,30,40,70,60};
		int sum =0;
		for(int i = 0; i < grades.length; i++) {
			if(grades[i] == 30 ) {
				grades[i] = 60;
			}
			sum += grades[i];
		}
		System.out.println("합계 : " +sum  +" | 평균 : " + (sum/grades.length));
		
		
		
		// ------ 8번문제
		System.out.println();
		
		int[][] arr = {{100,90,30,50,70 }, {60,20,90,40,80 }};
		int totals = 0, max = 0, array_count = 0;
		for (int i = 0; i < arr.length ; i++) {
			for(int n = 0; n < arr[i].length ; n++) {
				
				totals += arr[i][n];
				array_count++;
				if(max < arr[i][n]) max = arr[i][n];
			}
		}
		System.out.println("합계 : "+ totals);
		System.out.println("평균 : " +(totals / array_count) );
		System.out.println("1등 : " + max);
		

		//------- 9번 문제
		System.out.println();
		int one = 0, two =0;
		int test = (5%2);
		String msg = "";
		for (int i = 5 ; i <=8 ; i++) {
			if(i % 2 == 0) {
				two ++;
				msg += i+ ( i == 8 ? ":짝수" : ":짝수/");
			}
			else if ( i%2==1) {
				one++;
				msg += i+":홀수/";
			}
		}
		System.out.println(msg);
		System.out.println("홀수 " + one + "개 짝수 " + two +"개");
		System.out.println("문자열의 길이 "+msg.length());
		
		
		//---------10번 문제
		
		Scanner scn = new Scanner (System.in);
		boolean scanboolean = true ; 
		String[] birth = null;
		
		do {
			System.out.print( "주민번호를 입력해주세요 : ");
			String str= scn.nextLine();
			if(str.length() == 14) {
				if(str.contains("-")) {
					 
//					 String pattern = "(\\d{2})(\\d{2})(\\d{2})";
					 String replaces = str.split("-")[0].replaceAll("(\\d{2})(\\d{2})(\\d{2})", "$1-$2-$3");
					 birth = replaces.split("-");

						Calendar cal = Calendar.getInstance();
						int year = cal.get(Calendar.YEAR);
						
						
						int age = Integer.parseInt(birth[0]);
						String gender = String.valueOf(str.split("-")[1].charAt(0));
						int year_change = 0;
						switch (gender) {
						case "1" : 
							gender = "남성";
							year_change = 1;
							break;
						case "2" : 
							gender = "여성";
							year_change = 1;
							break;
						case "3":
							gender = "남성";
							break;
						case "4" :
							gender = "여성";
							break;
						}
						System.out.println("나이 : 만 " + (year - (age + (year_change == 0 ? 2000 : 1900 ) )+"세"));
						System.out.println("성별 : " + gender);
						System.out.println("생일 : " + birth[1] +"월 " + birth[2] +"일" );
						scanboolean = false;

				} else {
					System.out.println("올바른 형식이 아닙니다.");
				}
			} else {
				System.out.println("(오류) 잘못된 입력값입니다.");
			};
		} while (scanboolean);
		
	}

}
