package com.irinaliz.study_diary.b06_jun.day3;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h_and_z = 4;
		if(h_and_z %  2 == 1) {
			System.out.println("홀수");
		} else if ( h_and_z % 2 == 0) {
			System.out.println("짝수");
		}
		
		//속도를 고려하였을땐 IF문보다 Switch 더 빠르다.
		//예제 1번
		int gender = 1;
		switch ( gender) {
		case 1: System.out.println("남성입니다");
			break;
		case 2:System.out.println("여성입니다");
			break;
		default :
			System.out.println( "잘못된 값입니다");
			break;
		}
		
		//예제 2번
		int in = 7;
		switch (in % 2 ) {
		case 0: System.out.println(" 짝수 입니다.");
			break;
		case 1:	System.out.println(" 홀수 입니다.");
			break;
			default:
				System.out.println("이상한 번호입니다");
		}
		
		
		
		
	}

}
