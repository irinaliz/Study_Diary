package com.irinaliz.study_diary.b06_jun.day3;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] months = { 1,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i = 0; i < months.length ; i ++) {
			String season = "";
			if( months[i]  <= 2 || months [i]>= 11) season = "겨울";
			else if (  months[i] >= 3 && months[i] <= 6) season = "봄";
			else if (months[i] >= 7 && months[i] <= 10) season = "가을";
			else season = "여름";
			System.out.print(season + (i < months.length-1 ? ", " :"" ));
			
		}
		System.out.println();
		
		for(int front = 2; front <= 4; front ++) {
			for(int back = 1; back <= 3; back++) {
				System.out.println(front + " * " + back + " = " + front * back);
			}
		}
		

		for( int i = 0; i < months.length ; i++) {
			String season ="";
			switch(months[i]) {
			
			case 1: case 2: case 11: case 12:
				season = "겨울";
				break;
			case 3: case 4: case 5: case 6:
				season = "봄";
				break;
			case 7: case 8: case 9: case 10:
				season = "가을";
				break;
				
			default : season = "여름";
			
			}

			System.out.print(season + (i < months.length-1 ? ", " :"" ));
		}
	}
	

}
