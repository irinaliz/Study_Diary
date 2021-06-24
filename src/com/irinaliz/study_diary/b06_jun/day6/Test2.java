package com.irinaliz.study_diary.b06_jun.day6;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		roomsize(100);
//		calculator(32, 5,"^");
//		page1();
//		page2();
//		test(59, 60);
		int[] i = {1,2,3,4,5,6,7,8 };
		System.out.println("점수합 " + sum(i));
		
	}

	public static void roomsize(double num) {
		
		System.out.println(num * 0.3025);
	}
	
	public static void calculator ( int a, int b , String s) {
		
		switch(s) {
		case "+" :
			System.out.println( a+b );
			break;
		case "-" :
			System.out.println( a-b );
			break;
		case "*" :
			System.out.println( a*b );
			break;
		case "%" :
			System.out.println( a%b );
			break;
		case "/" :
			System.out.println( a/b );
			break;
		case "^" :
			System.out.println( Math.pow(a, b) );
			break;
			
		
		}
	}
	
	public static void page1() {
		int a= 52;
		int page = 0;
		boolean last_page = true;
		while(last_page) {
			if(a >= 10) {
				page++;
				a -= 10;
			} else {
				page ++;
				last_page = false;
			}
		}
		
		System.out.println("페이지의 수 : " + page);
		System.out.println("남은 게시글 : " + a );
	}
	
	public static void page2() {
		int a = 52;
		int last_page = 0 ;
		int post = 0;
		if( a%10 == 0) {
			last_page = a/10;
		} else {
			last_page = a/10+1;
			post = a%10;
		}
		System.out.println("전체글 : " + a + " : " + " 페이지 : " +last_page + " 남은 글 : " + post);
		
		int pages = (int) Math.ceil( (double) 52 /10 );
//		int pages = (int) Math.ceil(  52 /10 );
		System.out.println(52/10);
		System.out.println(pages);
	}
	
	public static void test(int a, int b) {
		if( a < 60 ||  b < 60 ) {
			System.out.println( "A과목 : " + a + " B과목 :" + b + " 로 재시험입니다.");
		} else {
			System.out.println("두 과목 다 통과입니다." + "A과목 : " + a + " B과목 : " + b);
		}
	}
	
	public static int sum(int[] list) {
		int sum = 0;
		for (int i = 0; i < list.length ;i++) {
			sum += list[i];
		}
		return sum;
	}
}
