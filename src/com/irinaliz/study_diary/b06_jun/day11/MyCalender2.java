package com.irinaliz.study_diary.b06_jun.day11;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MyCalender2 {
    public static void main(String[] args){
        MyCal(2021,11);

        Teacher_Calender.myCalendar();
    }

    public static void MyCal(int year , int month){
        Calendar cal = Calendar.getInstance();

        int y = year;
        int m = month;
        cal.set(year,month,1);
//        cal.set(2021,6,1);
        int lastday = cal.getActualMaximum(Calendar.DATE);
        int week = cal.get(Calendar.DAY_OF_WEEK); // 5를 배출

        System.out.println(y +"년 " +(m+1)+"월");
        System.out.println("일  월  화 수  목 금  토");
//        int cnt = 1;
        /*
        for(int i = 1; i<week ; i++){
            System.out.print("   ");
            cnt++;
        }

         */

        for(int i = 1; i <=lastday+week-1; i++){
            if(i < week){
                System.out.print("   ");
                continue;
            }
            if(i-week+1 < 10) System.out.print("0");

            System.out.print(i-week+1 + " ");

            if(i%7==0) System.out.println();
        }
        System.out.println();
    }
}
