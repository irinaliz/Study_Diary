package com.irinaliz.study_diary.b06_jun.day2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = ++a;
		System.out.println("a: "+ a ); //2
		System.out.println("b: "+ b ); //2
		

		int c = 1;
		int d = c++; //++가 어디있냐에 따라 순서가 달라짐, c가 d에 대입된 후 c++가 적용되어 C: 2, D: 1이 출력
		System.out.println("c: "+ c ); //2
		System.out.println("d: "+ d ); //1
	}

}
