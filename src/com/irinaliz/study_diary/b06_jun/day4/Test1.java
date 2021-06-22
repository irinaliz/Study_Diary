package com.irinaliz.study_diary.b06_jun.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		while(true) {
			Scanner scn = new Scanner (System.in);
			System.out.println("크리스마스는 몇일이~게~");
			if(scn.hasNextInt()) {
				int i = scn.nextInt();
				if(i == 25) {
					System.out.println("빙고!");
					break;
				} else System.out.println("틀렸는데욤 ");
			}
			else System.out.println("번호만 입력해달라구용..");
			
		}
		System.out.println("시스템 종료할게욤");
	}

}
