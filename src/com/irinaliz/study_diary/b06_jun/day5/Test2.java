package com.irinaliz.study_diary.b06_jun.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
//		q1();
//		q2();
//		q3();
	}
	

	
	public static void q1() {
		String empinfo =" 입사일:20150120, 이름:홍길동, 직급:대리 ";
		System.out.println("문자열 길이 : " + empinfo.length());
		empinfo = empinfo.trim();
		System.out.println(empinfo);
		System.out.println(empinfo.replace("대리", "과장"));
		System.out.println(empinfo.split(",")[0]);
		System.out.println(empinfo.split(", ")[1] + ", " + empinfo.split(", ")[2]);
		System.out.println();
		
		String[] list = empinfo.split(", ");
		for(int i = 0 ; i < list.length ; i++) {
			System.out.println(list[i]);
		}

		for(int i = 0 ; i < list.length ; i++) {
			System.out.print(list[i].split(":")[1] + (i != 2 ? "/" : ""));
		}
	}
	public static void q2() {
		String hiredate = "801225,891005,980503,771001";
		
		//2-1번문제
		String[] list = hiredate.split(",");
		for (int i = 0; i < list.length ; i++) {
			System.out.println(list[i]);
		}
		
		
		System.out.println();
		System.out.println(" - - - - 방식 1번 - - - - ");
		//2-2번문제 방식 1
		for (int i = 0 ; i < list.length ; i ++) {
			System.out.println( list[i].charAt(0) +""+ list[i].charAt(1) 
					         + "/" +list[i].charAt(2)  +list[i].charAt(3)
							 + "/" + list[i].charAt(4)  + list[i].charAt(5));
		}
		
		
		System.out.println();
		System.out.println(" - - - - 방식 2번 - - - - ");
		//2-2번문제 방식 2
		for( int i = 0; i < list.length ; i++) {
			for(int character =0; character < list[i].length() ; character++ ) {
				if(character % 2 ==0 && character > 0) {
					System.out.print("/");
				}
				System.out.print(list[i].charAt(character));
			}
			System.out.println();
		}
	}
	public static void q3() {


		String address = "123456 서울특별시 강남구 서초동 12";
		System.out.println(address.split(" ")[0]);
		System.out.println(address.split("123456")[1]);
		System.out.println(address.substring(7));
		
		System.out.println(address.substring(0, 3) + "-" + address.substring(3,6));
		
		String str = String.format("%,d",Integer.parseInt(address.split(" ")[0]));
		System.out.println(str.replace(",", "-"));
		
		
		
	}
	
	
	
}
