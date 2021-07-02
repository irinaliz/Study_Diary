package com.irinaliz.study_diary.b06_jun.day12.trycatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class trys {
    public static void main1(String[] args)   {

        if(1<2){
            try {
                throw new MyException("");
            } catch (MyException e) {
                System.out.println(e.toTest());
            }

        }

    }
    public static void main2(String[] args) throws MyException{
        throw new MyException("매개변수 오류");
    }
    public static void main(String[] args) throws MyException{
        try {
            throw new MyException().toTest();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}

class MyException extends Exception {
    public MyException(String str){
        super(str);
    }
    public MyException(){}

    public Throwable toTest(){
        System.out.println("helol");
        return null;
    }
}

class MyException1 extends FileNotFoundException {
    public String toTest(){
        return "에러임";
    }
}