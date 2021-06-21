package com.irinaliz.study_diary.b06_jun.day3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean start = true;
		
		do {
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println(" = 드시려는 커피의 번호를 입력해주세요. = ");
		System.out.println("1. 아메리카노");
		System.out.println("2. 다방커피");
		System.out.print("*커피번호 >>");
			if(scan1.hasNextInt()) {
				int coffee_number = scan1.nextInt();
				String prefix = null;
				String coffee = null;
				
				//아메리카노
				if(coffee_number == 1) {
					System.out.println("= 아메리카노를 선택 했습니다. =");
					System.out.println("1. 설탕넣기");
					System.out.println("2. 설탕 없음");
					System.out.print("*설탕번호 >>");
					
					coffee = " 아메리카노";
					
					Scanner scan2 = new Scanner(System.in);
					
					if(scan2.hasNextInt()) {
						int scan_number = scan2.nextInt();
						
						if(scan_number== 1) prefix = "설탕 넣은";
						else if(scan_number == 2) prefix = "설탕 없는";
						else {
							System.out.println("없는 번호 또는 올바른 번호가 아닙니다.");
							continue;
						}
					} else{
						System.out.println("없는 번호 또는 올바른 번호가 아닙니다.");
						continue;
					}
					
				}
				
				//다방커피
					else if(coffee_number == 2) {
					System.out.println(" = 다방커피를 선택했습니다. = ");
					System.out.println("1. 프림1 + 설탕1 ( 연한맛 )");
					System.out.println("2. 프림2 + 설탕2 ( 단맛 ) ");
					System.out.println("3. 프림3 + 설탕3 ( 아주 단맛 ) ");
					System.out.print("*선택 번호 >>");
					
					coffee = "의 다방커피";
					
	
					Scanner scan2 = new Scanner(System.in);
					
					if(scan2.hasNextInt()) {
						int scan_number = scan2.nextInt();
						if(scan_number == 1) prefix = "연한 맛";
						else if(scan_number == 2) prefix = "단 맛";
						else if(scan_number == 3) prefix = "아주 단 맛";
						
					}
					
				} else {
					System.out.println("없는 번호 또는 올바른 번호가 아닙니다.");
					continue;
				}
				
				if(prefix == null || coffee ==null ) {
					System.out.println("커피 또는 감미료를 넣지 않았습니다.");
					continue;
					}
				 else {
					 System.out.println("결과 >> " + prefix + coffee +"가 나왔습니다." ); 
					 start = false;
				 }
				
			} else {
				System.out.println("없는 번호 또는 올바른 번호가 아닙니다.");
				continue;
			}
			
		} while(start);
	}
	

}
