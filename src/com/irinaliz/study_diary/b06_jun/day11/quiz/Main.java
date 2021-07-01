package com.irinaliz.study_diary.b06_jun.day11.quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        Q1.q1(2021,12,25); //동시에 3번문제.
        Q1.q4("2021-04-25" , "2021-06-25");

        Q1.q2();

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat df =
                new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 E요일 입니다.");
        System.out.println(df.format(date));


    }
}
