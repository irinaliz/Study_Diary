package com.irinaliz.study_diary.b06_jun.day11;

import java.util.Calendar;
import java.util.TimeZone;

public class UnixTimes {
    public static void main(String[] args) throws Exception{

        unix();
        utc();
/*
        for(int i = 1; i <= 10; i++){
            Calendar cal = Calendar.getInstance();
            System.out.println(cal.getTimeInMillis()/1000);
            if(i%100==0){
                System.out.println(i);
            }
//            Thread.sleep(1000);
        }
        */

    }

    public static void unix(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTimeInMillis());
        System.out.println(cal.get(Calendar.HOUR) + "시 " + cal.get(Calendar.MINUTE) + "분 "+ cal.get(Calendar.SECOND));

    }
    public static void utc(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        System.out.println(cal.getTimeInMillis());
        System.out.println(cal.get(Calendar.HOUR) + "시 " + cal.get(Calendar.MINUTE) + "분 "+ cal.get(Calendar.SECOND));
    }
}
