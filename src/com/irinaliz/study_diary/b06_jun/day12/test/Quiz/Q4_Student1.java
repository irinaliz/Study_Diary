package com.irinaliz.study_diary.b06_jun.day12.test.Quiz;

import java.util.Calendar;

public class Q4_Student1 {
    String name;
    String birth;
    String School;
    int age;
    int month;
    int date;

    public Q4_Student1(String name, String birth, String School) {
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
