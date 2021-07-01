package com.irinaliz.study_diary.b06_jun.day11;

import java.util.Calendar;

public class Teacher_Calender {

    public static void myCalendar() {

        Calendar cal = Calendar.getInstance();

        int y = 2020;
        int m = 0;

        cal.set(y,m,1);

        int wk = cal.get(Calendar.DAY_OF_WEEK); // 5
        int lastday = cal.getActualMaximum(Calendar.DATE);

        int cnt = 1;

        System.out.println( y+"년 "+(m+1)+"월 \n");
        System.out.println("일  월  화  수  목  금  토");

        // 공백출력
        for(int i=1; i<wk; i++) {
            System.out.print("   ");
            cnt++;
        }
        // 날짜출력
        for(int d=1; d<=lastday; d++) {
            if( d < 10 ) System.out.print("0");
            System.out.print( d + " ");
            if( cnt%7 == 0 ) {
                System.out.println();
            }
            cnt++;
        }
    }
}
