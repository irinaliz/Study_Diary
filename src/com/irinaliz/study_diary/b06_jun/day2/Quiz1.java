package com.irinaliz.study_diary.b06_jun.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q1();
//		q2();
//		q3();
//		q4();
//		q5();

		
	}
	
	public static void q1() {
		int t = 12;
		System.out.println( "1번) 지금은 " + ( (t < 12) ? "오전"  : "오후") + " 입니다.");
	}
	
	public static void q2() {
		for ( int i = 3 ; i <= 17; i +=3) {
			System.out.print(((i == 3) ? "2번) " : "") + i + ((i == 15) ? "" : ", ") );
		}

		System.out.println();
		
		for (int i = 0 ; i <= 17 ; i ++) {
			if(i % 3 == 0 ) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}
	
	public static void q3() {
		
		for (int i= 101; i <= 109; i++) {
			if(i == 104 || i == 107) {
				System.out.println();
			}
			System.out.print(i + " ");
			
		}
		
		
		
		System.out.println();
		
		int a= 1;
		for (int i= 1; i <= 30; i++) {
			if(i == a) {
				a += 3;
				System.out.println();
			}
			System.out.print((i+100) + " ");
		}
		
		

		
		System.out.println();
		
		for (int i= 1; i <= 30; i++) {
			if(i % 3 == 0) {
				System.out.print((i+100) + " ");
				System.out.println();
			} else {
				System.out.print((i+100) + " ");
			}
		}
		
		
	}

	
	public static void q4() {
		String t = "18:50";
		String[] time = t.split(":");
		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		System.out.println( (hour < 12 ? "오전 " : "오후 ") + (hour < 12 ? hour : hour-12) + "시 " + minute + "분 입니다." );
	}
	
	public static void q5() {
		
		LinkedHashMap <String , Integer> map = new LinkedHashMap < String, Integer>();
		
		map.put("영어", 90);
		map.put("수학", 88);
		map.put("과학", 75);
		map.put("체육", 55);
		map.put("국어", 95);
		
		for ( Map.Entry <String, Integer> scores : map.entrySet()) {
			System.out.println(scores.getKey() + scores.getValue());
		}
		
		
		int eng = 80;
		String result = (eng >= 80) ? "A등급" : (eng  >= 60) ? "B등급" : "C등급";
		
		
		
	}
	
}
