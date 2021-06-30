package com.irinaliz.study_diary.b06_jun.day10.abstracts.Entity;

import com.irinaliz.study_diary.b06_jun.day10.Interfaces.*;
import com.irinaliz.study_diary.b06_jun.day10.Type;
import com.irinaliz.study_diary.b06_jun.day10.abstracts.Creature;
import com.irinaliz.study_diary.b06_jun.day10.world.Location;

public class Human extends Creature implements default_behavior, Talk, Tools, Swim, Walk {
    String name;
    boolean walking = false;
    boolean talking = false;
    boolean useTools = false;
    boolean swiming = false;

    public Human(Location loc , int age, int gender, int height, int weight , String name) {
        super(Type.HUMAN, loc , age, gender, height, weight);
        this.name = name;
    }
    public Human(Location loc , int age, String name) {
        super( Type.HUMAN, loc , age);
        this.name = name;
    }

    @Override
    public void walk() {
        this.walking = !walking;
    }

    @Override
    public void Talking() {
        this.talking = !talking;
    }

    @Override
    public void UseTools() {
        this.useTools = !useTools;
    }

    @Override
    public void Swiming() {
        this.swiming = !swiming;
    }
    public static int Generator_height(int age){

        double min = (age < 5 ? 7 :
                   age < 8 ? 14 :
                   age < 13 ? 12 :
                   age < 17 ? 8.5 :
                   age < 20 ? 8 : 7.5)* age;

        double max = (age < 5 ? 7:
                    age < 8 ? 15 :
                    age < 13 ? 13:
                    age < 17 ? 11:
                    age < 20 ? 10: 10.5) * age;

        int height=0;
        while(true){
            int num = (int) (Math.random()*200);
            if(min <= num && num <=max){
                height = num;
                break;
            }
        }


        return height;
    }

    public static int Generator_weight(int gender, int height){
        int weight = (int) (gender == 0 ? (height / 2.5) : (height / 2.5 ) - 6);
        return weight;
    }
}
