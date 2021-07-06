package myStudy;

import java.io.File;

public class TestFor {
    public static void main(String[] args){
        int[] num = new int[20]; //배열 크기 20
        for(int i = 0; i< num.length ; i++){
            System.out.println(num[i]);
        }

        for ( int i : num){
            System.out.println(i);
        }


    }
}
