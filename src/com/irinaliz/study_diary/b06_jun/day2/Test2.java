package com.irinaliz.study_diary.b06_jun.day2;

public class Test2 {

	public static void main(String[] args) {

		String[] subject = {"영어", "수학", "과학", "체육", "국어"};
		int[] point = { 90,88,75,55,95 };
		String Rank;
		for(int i = 0; i <= subject.length-1 ; i++) {
			
			Rank = (point[i] >= 90) ? " A등급" :
				   (point[i] >= 80) ? " B등급" :
				   (point[i] >= 70) ? " C등급" :
				   (point[i] >= 60) ? " D등급" : " F등급";
			
			System.out.println(subject[i] + Rank);
		}
		
		
		System.out.println("--------------");
		
		int num = -1;
		System.out.println( ((num > 0) ? "양수" :(num < 0) ? "음수" : "0") + " 입니다" );
		
		
		
		int math = 77;
		if(math < 60) {
			
		} else if (math >= 60 && math < 70) {
			
		} else if(math >= 70 && math<80) {
			
		} else if (math >=  80 && math <90) {
			
		} else {
			
		}
	}
}
