package com.irinaliz.study_diary.b06_jun.day12.test.Quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Q5_unix {
    public static void Last_Day(){
        Calendar now = Calendar.getInstance();
        Calendar future = Calendar.getInstance();
        future.set(now.get(Calendar.YEAR), now.getActualMaximum(Calendar.MONTH), now.getActualMaximum(Calendar.DATE));

        long Day_Time = (future.getTimeInMillis() - now.getTimeInMillis())/(60*60*24)/1000;

        SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(df.format(future.getTimeInMillis()) + " 까지 " + Day_Time + "일 남았습니다.");
    }
}
