package com.irinaliz.study_diary.b06_jun.day8.q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score sc = new Score(100,90);
		
//		System.out.println("국어 : " +sc.kor + " 영어 : " +sc.eng + " 평균 : "  + ((sc.kor+sc.eng)/2));
		
		int kor = sc.kor;
		int eng = sc.eng;
		int avg = (kor+eng)/2;
		System.out.println("국어 : " +kor);
		System.out.println("영어 : " +eng);
		System.out.println("평균 : " +avg);
		
	
	}
	
}
