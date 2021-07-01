package com.irinaliz.study_diary.b06_jun.day12.test.Quiz;

public class Q3 {
    public static void Quiz4(int[] arr){
        int avg =0;
        int max =0;
        int min = arr[0];

        for(int a = 0; a<arr.length ; a++){
            if(max < arr[a]) max = arr[a];
            if(min > arr[a]) min = arr[a];
            avg += arr[a];
        }
        avg = avg/arr.length;

        System.out.println("평균 : " + avg + " 최고 : " + max + " 최저 : " + min );
    }
}
