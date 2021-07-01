package com.irinaliz.study_diary.b06_jun.day11.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Q1 {
    public static void q1(int year, int month, int date){
        Calendar Xmas_cal = Calendar.getInstance();
        long now_long = Xmas_cal.getTimeInMillis();

        Xmas_cal.set(year , (month-1), date);
        long xMas_long = Xmas_cal.getTimeInMillis();

        long D_Day = (xMas_long/1000 - now_long/1000);
        System.out.println(year + "년 " + month + "월 " + date + "일 까지 " + D_Day/86400 +"일 남음");
    }

    public static void q4(String past , String future ){
        String[][] time = {past.split("-") , future.split("-") };
        int[][] int_time = new int[time.length][time[0].length];
        for(int i= 0; i < int_time.length ;i ++){
            for (int a = 0; a < int_time[i].length; a ++ ){
                int_time[i][a] = Integer.parseInt(time[i][a]);
            }
        }
        Calendar cal = Calendar.getInstance();
        cal.set(int_time[0][0], (int_time[0][1]-1),int_time[0][2]);

        Calendar cal1 = Calendar.getInstance();
        cal1.set(int_time[1][0], (int_time[1][1]-1),int_time[1][2]);

        long cal_long = cal.getTimeInMillis()/1000;
        long cal1_long = cal1.getTimeInMillis()/1000;

        System.out.println((cal1_long - cal_long )/ 86400 + "일 차이가 납니다.");


    }

    public static void q2(){
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();

        cal.set(2021,5,01);
        cal1.set(2021,10,02);

        long longcal = cal.getTimeInMillis();
        long longcal1 = cal1.getTimeInMillis();

        long longcal_result = longcal1-longcal;
        Calendar cal2 = Calendar.getInstance();
        cal2.setTimeInMillis(longcal_result);
        if(cal2.get(Calendar.YEAR) == 1970){
            cal2.set(0,cal2.get(Calendar.MONTH),cal2.get(Calendar.DATE));
        }

        int yy = (cal2.get(Calendar.YEAR) <= 1 ? 0: cal2.get(Calendar.YEAR));
        int mm = cal2.get(Calendar.MONTH)+1;
        int dd = cal2.get(Calendar.DATE);
        System.out.println("2021-06-01과 2021-11-02의 차이는 " + yy+"년 " + mm + "월 " + dd+"일 입니다.");

    }
}
