package com.irinaliz.study_diary.b06_jun.day8.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Tvapp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("배열을 얼만큼 만드시겠습니까? >> ");
		
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
	
		String [] color = {"Red" , "Yellow", "Green", "Blue", "Purple", "White", "Black", "Silver", "Gold", "Gray"};
		ArrayList<String> color_list = new ArrayList<String>(Arrays.asList(color));
		
		Integer[] size = {10,20,30,40,50,60,70,80,90,100};
		ArrayList<Integer> size_list = new ArrayList<Integer>(Arrays.asList(size));
		
		
		ArrayList<Tvinfo> arr = new ArrayList<Tvinfo>();
		
		for(int i = 0; i< count ; i++) {
			
			char ch = (char) ((Math.random()*26) + 65);
			int size_num = size_list.get(((int) (Math.random()*10)) );
			int num = (int) (Math.random()*100);
			String colors = color_list.get((int) Math.random()*10);
			arr.add(new Tvinfo(ch+""+num+"TV" , colors, size_num , (num*10)));
			
		}
		
		String colorlist = check_color(scn, color_list); // null일수도 있다.
		int size_check = check_inchi (scn,size_list);
		int price = check_price(scn);
		
		System.out.println(colorlist);
		System.out.println(size_check);
		
		
		List<Tvinfo> list = arr;
		if(colorlist != null) list = arr.stream().filter( str -> str.color.equals(colorlist) ).collect(Collectors.toList());
		
		if(size_check != 0) list = arr.stream().filter(i -> i.size == size_check ).collect(Collectors.toList());
		
		if(price != 0) list = arr.stream().filter(i -> i.price <= price).collect(Collectors.toList());
		
		
		for(Tvinfo tvs : list) {
			System.out.println("찾은 모델 명 : " + tvs.model + " 컬러 : " + tvs.color + " 사이즈 : " + tvs.size + " 가격 : " + tvs.price);
		}
		
		
	}

		
	
	
	
	public static String check_color(Scanner scn , ArrayList<String> color_list ) {


		System.out.print("원하시는 색상을 찾고계시나요? (y/n) >> ");
		
		String color_check = scn.next();
		
		String want_color = null;
		if(color_check.equals("y")) {
			System.out.println();
			System.out.println("원하시는 색상을 입력해주세요! >> " );
			System.out.println("색상표 - - - - -");
			color_list.forEach(System.out::println);
			
			while(true) {
				want_color = scn.next();
				if( color_list.contains(want_color)) break;
				else System.out.println(" 존재하지 않는 색상입니다! 다시 입력해주세요.");
			}
			
		}
		
		return want_color;
	}
	
	public static int check_inchi(Scanner scn, ArrayList<Integer> size_list) {
		
		System.out.print("원하시는 사이즈를 찾고계시나요? (y/n) >> ");
		String size_check = scn.next();
		int size = 0;
		
		if(size_check.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.println("원하시는 사이즈를 입력해주세요! >> " );
			System.out.println("사이즈 표 - - - - -");
			size_list.forEach(System.out::println);
			
			while(true) {
				size = scn.nextInt();
				if(size_list.contains(size)) break;
				else System.out.println(" 존재하지 않는 사이즈 입니다! 다시 입력해주세요.");
			}
		}
		
		return size;
		
	}
	
	public static int check_price (Scanner scn) {
		System.out.print("원하시는 금액대를 찾고 계시나요? (y/n) >> ");
		

		String money_check = scn.next();
		int money = 0;
		
		if(money_check.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.println("원하시는 금액대를 입력해주세요! >> " );
			
			while(true) {
				money = scn.nextInt();
				if(money > 0) break;
				else System.out.println(" 맞지 않는 형식 입니다! 다시 입력해주세요.");
			}
		}
		return money;
	}
	

}
