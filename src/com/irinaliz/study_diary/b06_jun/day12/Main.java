package com.irinaliz.study_diary.b06_jun.day12;

import com.irinaliz.study_diary.b06_jun.day12.test.Quiz.Q2;
import com.irinaliz.study_diary.b06_jun.day12.test.Quiz.Q3;
import com.irinaliz.study_diary.b06_jun.day12.test.Quiz.Q5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){
        /*
        Q2.quiz2(989.123);
        Q3.Quiz4(new int[]{12,3,4,5,6,7,8,9});


        Q4_Student q4_student = new Q4_Student("이보민", "1997/05/17", "신림고등학교");

        q4_student.Student_Info();
        */

        for(int a = 1 ; a<300; a++){
            System.out.println();
        }
        Q5 q5 = new Q5("1q2w3e4r");
        q5.Service_Start();


    }

    public static void qdw(){
        double dos = 97.123;
        String str = dos+"";
        BigDecimal a = new BigDecimal(str+"").setScale(0, RoundingMode.FLOOR);
        BigDecimal b = new BigDecimal(str+"");

        System.out.println( a);
        System.out.println( b.subtract(a));

    }

    public static void qcxz(){
        double t2 = 97.123;
        double t2_2 = Math.floor(t2);
        double t2_3 = t2-t2_2;

        double t2_4 = (double)Math.round(t2_3*1000)/1000;
        System.out.println((int)t2_2);
        System.out.println(t2_4);

    }
}
