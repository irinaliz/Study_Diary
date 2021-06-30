package com.irinaliz.study_diary.b06_jun.day10;


import com.irinaliz.study_diary.b06_jun.day10.abstracts.Entity.Human;
import com.irinaliz.study_diary.b06_jun.day10.world.Location;

public class Main {
    public static void main(String[] args){




        for (int a = 0; a < 50; a++){
            Human c = new Human(new Location(1,5), 20,"이보민");
            System.out.println("성별 : " + (c.getGender() ==0 ? "남자" : "여자") + " 신장 : " + c.getHeight() + " 몸무게 : " + c.getWeight());
            System.out.println(c.getType());
        }




    }
}
