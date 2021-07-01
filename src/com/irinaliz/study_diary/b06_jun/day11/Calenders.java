package com.irinaliz.study_diary.b06_jun.day11;

import java.util.Calendar;
import java.util.TimeZone;

public class Calenders {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
//        System.out.println(cal);
        Calendar cal1 = new Calendar.Builder().build();
        cal1.set(1970,0,1,0,0,0);

        long a = cal.getTimeInMillis(); //21년
        System.out.println(a);
        System.out.println(a/1000);

        long b = cal1.getTimeInMillis(); // 1970년
        System.out.println(b);

        long c = a-b; // 2021년 - 1970년의 값을 c에다가
        System.out.println(c);
        Calendar cal2 = new Calendar.Builder().build();
        cal2.setTimeInMillis(0);


        int c1 = cal2.get(Calendar.YEAR);
        int c2 = cal2.get(Calendar.MONTH);
        int c3 = cal2.get(Calendar.DATE);

        cal2.setTimeInMillis(-32400000);
        int c4 = cal2.get(Calendar.HOUR);
        int c5 = cal2.get(Calendar.MINUTE);
        int c6 = cal2.get(Calendar.SECOND);

        System.out.println(c1+ "년 " + c2 + "월 " +c3 + "일" + c4+  "시 " + c5 + " 분 " + c6 + "초" +" set long");


        int test1 = cal1.get(Calendar.YEAR);
        int test2 = cal1.get(Calendar.MONTH);
        int test3 = cal1.get(Calendar.DATE);

        System.out.println(test1+ "년 " + test2 + "월 " +test3 + "일");

/*
        int yy = cal.get(Calendar.YEAR);
        int mm = cal.get(Calendar.MONTH)+1;
        int max = cal.getActualMaximum(Calendar.DATE); // 해당 달의 마지막 날짜 구해온다.
        //-------------------------
        cal.set(yy,mm,29);
        System.out.println(cal.get(Calendar.DATE));
        cal.add(Calendar.DATE, 5);
        System.out.println(cal.get(Calendar.DATE));
        //29일 + 5일 하면 자동으로 다음달로 넘어가며 다음달 n일로 출력
        //---------------------
        System.out.println(max);
        cal.add(Calendar.DATE, 5);
        int dd = cal.get(Calendar.DATE);
        System.out.println(dd);
        int dd_add = cal.get(Calendar.DATE);
        int day_night = cal.get(Calendar.AM);
        int day_night1 = cal.get(Calendar.AM_PM);
        int hour = cal.get(Calendar.HOUR);
        int hour1 = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        cal.add(Calendar.HOUR, -5);
        hour = cal.get(Calendar.HOUR);
        System.out.println(hour);
        System.out.println(cal.get(Calendar.AM_PM));

        int week = cal.get(Calendar.DAY_OF_WEEK); //오늘이 이번주의 몇번째 요일인가
        int week1 = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);// 이번 요일이 이번달에 몇번째 요일인가
        int day_year = cal.get(Calendar.DAY_OF_YEAR);//

//        System.out.println(week); // 일1 월2 화3 수4 목5
//        System.out.println(week1);
//        System.out.println(day_year);




/*
        System.out.println(day_night);
        System.out.println(day_night1);

        System.out.println(yy + "- " + mm + "-" + dd);
        System.out.println( hour + " : " + minute + " : " + second);
        System.out.println(hour1 + " : " + minute + " : " + second);

 */


    }

}
