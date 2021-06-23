package com.irinaliz.study_diary.b06_jun.day5;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		dawda();
//		q1();
//		q2();
//		q3();
//		q4();
		q5();
		q5_1();
//		java_search2();
		
	}
	public static void dawda() {
		String[] string_list = "babo and stupid".split(" ");
		for(int i = 0; i < string_list.length ; i ++ ) {
			System.out.println(string_list[i]);
		}
		
	}
	
	public static void q1() {
		String subject = " Html,mysql,java ,java , java,java?,java! ";
		System.out.println(subject);
		
		System.out.println("subject replaced : "+subject.replace("mysql", "oracle"));
		
		System.out.println("subject triming length : " + subject.length());
		System.out.println("subject trimed length : " + subject.trim().length());
		
		System.out.println();
		
//		java_search(subject);
		java_search2(subject.replaceAll(" ", ""));
		
		System.out.println("subject 5번 값 : "+ subject.charAt(4));
		
		System.out.println("subject 값에 'javascript'란 값은 " +
				(subject.contains("javascript") ? "존재 합니다" : "존재하지 않습니다" ));
		
		String[] str_list = subject.split(",");
		System.out.println("subject의 두번째 배열 값 : " +str_list[1]);
	}
	
	public static void q2() {
		String title = "자바 프로그래밍 입문";
		String content = "자바를 이용하여 기초부터 중급까지 완성한다";
		int a = 0;
		
		if(title.contains("자바")) a++;
		if(content.contains("자바")) a++;
		
		switch(a) {
		case 0: System.out.println("자바라는 단어가 모두 포함되어 있지 않습니다."); break;
		case 1: System.out.println("자바라는 단어가 한쪽에만 포함되어 있습니다."); break;
		case 2: System.out.println("자바라는 단어가 모두 포함되어 있습니다."); break;
			default: System.out.println("잘못된 유입입니다.");
		}
		
	}
	
	public static void q3() {
		String score = "eng:70,kor:88,math:92";
		String[] list = score.split(",");
		for(int i=0; i< list.length ; i++) {
			System.out.println(list[i]);
		}
		
	}
	
	public static void q4() {
		String score = "eng:70,kor:88,math:92";
		String[] list = score.split(",");
		for(int i=0; i< list.length ; i++) {
			System.out.println(list[i].split(":")[1]);
		}
	}
	
	public static void q5() {
		String str = "java";
		String space = "";
		for(int i = 0 ; i < str.length() ; i++) {
			for(int a=1; a <= i ; a++) {
				space += " ";
			}
			System.out.println(space + str.charAt(i));
			space = "";
		}
	}
	
	public static void q5_1() {
		String str = "java";
		String space = "";
		for (int i = 0; i <str.length() ; i++) {
			if(i > 0) {
				space += " ";
			}
			System.out.println(space + str.charAt(i));
		}
	}
	
	public static void java_search(String subject) {
		String java = "java";
		if (subject.contains(java)) {
			int front = subject.indexOf("java");
			
			for(int i = 0 ; i < java.length() ; i++) {
				if(java.charAt(i) == subject.charAt(front+i)) {
					System.out.print(subject.charAt(front+i));
				}
			}

			System.out.println();
			System.out.println();
		}
	}
	
	public static void java_search2(String subject) {
	
		String java = "java";
		String[] str_list = subject.split(",");
		
		for (int i = 0 ; i < str_list.length ; i++) {
			
			if(str_list[i].contains(java) && str_list[i].equals(java) ) {
				
				System.out.println(i + ". "+ str_list[i] + " 찾았다!");
			}
			
//			// ---------결과는 같지만, 다른 방법
//			if(!str_list[i].contains(java)) continue; 
//			if(!str_list[i].equals(java)) continue;
//			System.out.println(str_list[i]);
		}
	}
	
	public static void java_search3(String subject) {
		
		int no = subject.indexOf("java");
		if(no > -1) {
			System.out.println(subject.substring(no, no+4));
		} else {
			System.out.println("없는 단어임니다.");
		}
	}
}
