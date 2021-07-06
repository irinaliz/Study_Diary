package com.irinaliz.study_diary.b06_jun.day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class files {
    public static void main(String[] args) throws Exception{
        String message = "java File Text \n 테스트라구욤 \n히히히히ㅣㅎ!";
        String filename = "message.txt";
        String dir = "c:/Temp";
        String path = dir + "/" + filename;
        FileWriter fw = new FileWriter(path, false);
        fw.write(message); //작성 메소드
        fw.close();

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        String data  = "";
        while(true){
            data = br.readLine();
            if(data != null){
                System.out.println(data);
            } else {
                break;
            }
        }
        br.close();
        fr.close();
    }
}
