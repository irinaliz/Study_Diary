package com.irinaliz.study_diary.b06_jun.day12.test.Quiz;

public class Q2 {
    public static void quiz2(double value){
        String str = value+"";
        int a = Integer.parseInt(str.split("\\.")[0]);
        double b = Double.parseDouble(str.replace(a+"", "0"));

        System.out.println(a);
        System.out.println(b);


    }
}
