package com.irinaliz.study_diary.b06_jun.day12;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test0702_fri {

    public static void main(String[] args){

        //quiz 1
        System.out.println(Quiz1("우리 모두의 백과 사전"));
        System.out.println("-----------------------------------");

        //quiz 2
        Quiz2(97.123);
        System.out.println("-----------------------------------");

        //quiz 3
        Quiz3(new int[]{10,20,30,40});
        System.out.println("-----------------------------------");

        //quiz 4
        Q4_Student student = new Q4_Student("김호동", "2004/02/17","나래고등학교");
        Q4_Student student1 = new Q4_Student("강민수", "2005/07/22","삼한고등학교");
        student.Student_Info();
        student1.Student_Info();
        System.out.println("-----------------------------------");

        //quiz5
        Last_Day();
    }


    public static String Quiz1(String str){
        return str.replaceAll(" ", "");
    }


    public static void Quiz2(double value){
        String str = value+"";
        int a = Integer.parseInt(str.split("\\.")[0]);
        double b = Double.parseDouble(str.replace(a+"", "0"));

        System.out.println(a);
        System.out.println(b);
    }


    public static void Quiz3(int[] arr){
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


    public static void Last_Day(){
        Calendar now = Calendar.getInstance();
        Calendar future = Calendar.getInstance();
        future.set(now.get(Calendar.YEAR), now.getActualMaximum(Calendar.MONTH), now.getActualMaximum(Calendar.DATE));

        long Day_Time = (future.getTimeInMillis() - now.getTimeInMillis())/(60*60*24)/1000;

        SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(df.format(future.getTimeInMillis()) + " 까지 " + Day_Time + "일 남았습니다.");
    }

}
class Q4_Student {
    String name;
    String birth;
    String School;
    int age;
    int month;
    int date;

    public Q4_Student(String name, String birth, String School) {
        this.name = name;
        this.birth = birth;
        this.School = School;
        this.age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(this.birth.split("/")[0]) +1;
        this.month = Integer.parseInt(this.birth.split("/")[1]);
        this.date = Integer.parseInt(this.birth.split("/")[2]);
    }

    public void Student_Info(){
        System.out.print("이름 :" + this.name +" , ");
        System.out.print("나이 :" +  this.age +" , ");
        System.out.print(this.School);
        System.out.println();
    }

}