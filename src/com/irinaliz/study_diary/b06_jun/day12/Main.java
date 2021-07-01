package com.irinaliz.study_diary.b06_jun.day12;

import com.irinaliz.study_diary.b06_jun.day12.test.Quiz.*;
import com.irinaliz.study_diary.b06_jun.day12.test.implement.Q5_BankServicelmpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println(Q1.quiz1("우리 모두의 백과 사전"));
        Q2.quiz2(989.123);
        Q3.Quiz4(new int[]{12,3,4,5,6,7,8,9});
        Q4_Student q4_student = new Q4_Student("이보민", "1997/05/17", "신림고등학교");

        q4_student.Student_Info();


        Q5 q5 = new Q5("1q2w3e4r");
        q5.Service_Start();

    }
}
