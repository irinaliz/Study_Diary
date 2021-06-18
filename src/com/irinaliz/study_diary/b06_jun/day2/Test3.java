package com.irinaliz.study_diary.b06_jun.day2;

public class Test3 {

	public static void main(String[] args) {
		//자료형 (정수, 실수)
		byte by = 1; //-128~ 127
		short shr = 2; //-32,768 ~ 32,767
		int i = 3; //-2,147,483,648  ~ 2,147,483,647
		long lo = 4; //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float flo = 5.2f;  // -3.4E+38의 근사값 ~ 3.4E+38 의 근사값
		double dou = 5.9; // -1.7E+308의 근사값 ~ 1.7E+308의 근사값
		
		//저 최소값 ~ 최대값을 넘어버리면 오류가 난다.

		//참조형 변수
		String str = "java";
		//Class로 만들어진 자료형
		//String은 클래스의 이름일 뿐이다
		//참조형 변수는 저장공간에 참조(실제 저장된 객체의 위치값) 값이 저장된다.
		
		final String over = "over";
		//상수 (변하지 않는 고정된 값)
//		over = "error"; 넣을 시 오류가 난다.
		
		
		//배열 변수
		int[] list = {1, 2, 3, 4, 5};
		System.out.println("0번 값 : " + list[0]);
		System.out.println("1번 값 : " + list[1]);
		System.out.println("2번 값 : " + list[2]);
		System.out.println("3번 값 : " + list[3]);
		System.out.println("4번 값 : " + list[4]);
		System.out.println("list 길이 : " + list.length);
		//리스트의 값을 가져올땐 0번부터 카운팅한다.
		//하지만 길이는 1부터 카운팅된다.
		
		//다차원 배열
		int[][] list2 = {{1,2,3,4 } , {5,6,7, }};
		System.out.println(list2[0][0]); //1
		System.out.println(list2[0][1]); //2
		System.out.println(list2[0][2]); //3
		System.out.println(list2[0][3]); //4
		
		System.out.println(list2[1][0]); //5
		System.out.println(list2[1][1]); //6
		System.out.println(list2[1][2]); //7
		
 		System.out.println(list2.length); //이건 총 배열의 길이 값을 가져온다. = 2
 		System.out.println(list2[0].length); //이건 배열0번의 길이 값을 가져온다 = 4
 		System.out.println(list2[1].length); //이건 배열0번의 길이 값을 가져온다 = 3
 		System.out.println("-------------------");
 		
 		
 		int[][] list3 = { {1,2,3},{4,5,6},{7,8,9}, {10,11,12} };
 		//list3 같은것을 말할땐 2차원 배열이라한다
 		
 		System.out.println(list3[0][0]); //1
 		System.out.println(list3[0][1]); //2
 		System.out.println(list3[0][2]); //3
 		
 		System.out.println(list3[1][0]); //4
 		System.out.println(list3[1][1]); //5
 		System.out.println(list3[1][2]); //6
 		
 		System.out.println(list3[2][0]); //7
 		System.out.println(list3[2][1]); //8
 		System.out.println(list3[2][2]); //9
 		
 		System.out.println(list3[3][0]); //10
 		System.out.println(list3[3][1]); //11
 		System.out.println(list3[3][2]); //12
 		

 		System.out.println("-------------------");
 		int[][][] list4 = {
 				{ {1,2,3} , {4,5,6 } } ,
 				{ {7,8,9} , {10,11,12} } 
 				};

 		//list4 같은것을 말할땐 3차원 배열이라한다
 		// -------------------------------------------------|
 		//													|
 		// ----------------------------------------------	|
 		// ------------------------------------------	|	|
		System.out.println(list4[0][0][0]  ); // 1  |	|	|
		System.out.println(list4[0][0][1]  ); // 2  |	|	|
		System.out.println(list4[0][0][2]  ); // 3  |	|	|
 		// ------------------------------------------	|	|
		//												|	|
 		// ------------------------------------------	|	|
		System.out.println(list4[0][1][0]  ); // 4  |	|	|
		System.out.println(list4[0][1][1]  ); // 5  |	|	|
		System.out.println(list4[0][1][2]  ); // 6  |	|	|
 		// ------------------------------------------	|	|
 		// ----------------------------------------------	|
		//													|
 		// ----------------------------------------------	|
 		// ------------------------------------------	|	|
		System.out.println(list4[1][0][0]  ); // 7	|	|	|
		System.out.println(list4[1][0][1]  ); // 8	|	|	|
		System.out.println(list4[1][0][2]  ); // 9	|	|	|
 		// ------------------------------------------	|	|
		//												|	|
 		// ------------------------------------------	|	|
		System.out.println(list4[1][1][0]  ); // 10	|	|	|
		System.out.println(list4[1][1][1]  ); // 11	|	|	|
		System.out.println(list4[1][1][2]  ); // 12	|	|	|
 		// ------------------------------------------	|	|
 		// ----------------------------------------------	|
		//													|
 		// -------------------------------------------------|
	}
}
