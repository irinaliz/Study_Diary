package com.irinaliz.study_diary.b06_jun.day10.world;

import com.irinaliz.study_diary.b06_jun.day10.abstracts.Creature;

public class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void left() { this.x--;}
    public void right() { this.x++;}
    public void up() { this.y++;}
    public void down() { this.y--;}

    public Location getLocation(){

        return this;
    }

    public boolean hasNearing(Creature self ,Creature target){
        boolean return_value= false;
        int targetX = target.getX();
        int targetY = target.getY();
        int selfx = self.getX();
        int selfy = self.getY();

        if(((selfx - targetX) <= 3 ) && ((selfy - targetY) <= 3)){
            return_value = true;
        }



        return return_value;
    }


}
