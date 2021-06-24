package com.irinaliz.study_diary.b06_jun.day6;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		q1();
//		q2();
//		q3();
		q4();
	}
	public static void ex() {

		double n = 152.30;
		
		System.out.println(Math.ceil(n)); // 소수점을 위로 올림 , 실수형 반환 //153.0
		
		System.out.println(Math.floor(n)); //소수점을 아래로 내림, 실수형 반환 // 152.00
		
		System.out.println(Math.round(n)); //소수점을 반올림함 152.3 경우 152로 ,정수형 반환
		
		System.out.println(Math.rint(n)); //소수점을 반올림함 152.3 경우 152.00로,실수형 반환
		
		double a = -152.32;
		System.out.println(Math.abs(a)); //음수를 인자로 받아서 양수로 반환
		
		System.out.println(Math.pow(n, 2)); //n의 2승 => 첫번째 값에 대한, 두번째 인자로 제곱합니다
		
		System.out.println();
		System.out.println("- - - - 제곱근 - - - -");
		int[] i = {5,10};
		for(int b : i) {
			System.out.println(Math.sqrt(b));
		}

		int [] rank = {5, 10,15,20,25,30};
		int max = rank[0];
		for(int test : rank) {
			if(test > max) {
				max = test;
			}
		}
		System.out.println(max + " 이 가장 큰수 입니다.");
		
		System.out.println(Math.max(20, 5));
		System.out.println(Math.min(20, 5));
		
		double random = Math.random(); // 0초과 ~ 1미만의 실수형 값을 얻는다.
		System.out.println(random + " 실수 랜덤");
		int ran = (int) (Math.random() * 100);
		System.out.println(ran + " 정수 랜덤값");
	}

	public static void q1() {
		
		System.out.println(Math.max(90, 80));
	}
	
	public static void q2() {
		
		System.out.println(Math.max(20, Math.max(30, 40)));
		

		int [] rank = {5, 10,15,20,25,30 ,40,50,60,70,80,90,100,102};
		int max = rank[0];
		for(int test : rank) {
			if(test > max) {
				max = test;
			}
		}
		System.out.println(max + " 이 가장 큰수 입니다.");
		
	}
	
	public static void q3() {
		double avg = 68.29;
		System.out.println(Math.ceil(avg));
		System.out.println(Math.floor(avg));
	}
	
	public static void q4() {
		double abg = 68.29;
		System.out.println((int) Math.ceil(abg));
		System.out.println((int) Math.floor(abg));
	}
}
