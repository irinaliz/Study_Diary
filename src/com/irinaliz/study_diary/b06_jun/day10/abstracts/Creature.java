package com.irinaliz.study_diary.b06_jun.day10.abstracts;

import com.irinaliz.study_diary.b06_jun.day10.Type;
import com.irinaliz.study_diary.b06_jun.day10.abstracts.Entity.Human;
import com.irinaliz.study_diary.b06_jun.day10.world.Location;

public abstract class Creature extends Location{
    int age;
    int gender;
    int height;
    int weight;
    boolean alive = true;
    Location location;
    int health = 20;
    boolean Eat = false;
    boolean sleep = false;
    Type type;


    public Creature(Type type,Location loc, int age ) {
        super(loc.getX(), loc.getY());
        this.type = type;
        int gender = Generator_gender();
        int height = Human.Generator_height(age);
        int weight = Human.Generator_weight(gender , height);

        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.alive = true;
        this.location = loc;
    }
    public Creature(Type type,Location loc, int age, int gender ) {
        super(loc.getX(), loc.getY());
        this.type = type;
        this.age = age;
        this.gender = gender;
        this.height = Human.Generator_height(this.age);
        this.weight = Human.Generator_weight(gender , height);
        this.alive = true;
        this.location = loc;
    }
    public Creature(Type type,Location loc, int age, int gender, int health ) {
        super(loc.getX(), loc.getY());
        this.type = type;
        this.age = age;
        this.gender = gender;
        this.height = Human.Generator_height(this.age);
        this.weight = Human.Generator_weight(gender , height);
        this.health = health;
        this.alive = true;
        this.location = loc;
    }
    public Creature(Type type, Location loc, int age, int gender, int height, int weight ) {
        super(loc.getX(), loc.getY());
        this.type = type;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.alive = alive;
        this.location = loc;
    }
    public Creature(Type type,Location loc, int age, int gender, int height, int weight ,int health) {
        super(loc.getX(), loc.getY());
        this.type = type;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.alive = alive;
        this.location = loc;
        this.health = health;
    }


    public Creature Attack(Creature self ,Creature target){
        if(self.getLocation().hasNearing(self,target)){
            if(target.isAlive()){
                target.setHealth( (target.getHealth()-10) );
                System.out.println("타겟의 체력 : "  +target.getHealth() );
                if(target.getHealth() == 0){
                    target.setAlive(false);
                    System.out.println("타겟이 죽었습니다..");
                }
            }
        }

        return target;
    }

    public boolean isEat() {
        return Eat;
    }

    public void Eat(Creature self) {
        this.Eat = !self.Eat;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void Sleep(Creature self) {
        this.sleep = !self.sleep;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAge() { return age; }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Type getType() {
        return type;
    }

    public int Generator_gender(){
        int gender = ((int) (Math.random()*10)) <= 5 ? 0 : 1;
        return gender;
    }
    //    public void test1(){
//        System.out.println("test1");
//        test2();
//    }
//    private void test2(){
//        System.out.println("test2");
//    }
}
