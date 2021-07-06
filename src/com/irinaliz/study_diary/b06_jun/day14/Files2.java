package com.irinaliz.study_diary.b06_jun.day14;

import java.io.*;
import java.util.Scanner;

public class Files2 {
    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//        System.out.println("삭제할 라인 이름 ㄱㄱ");
        String delete_line = "뚱이";//scn.next();
        String path = "c:/Temp";
        File file = new File(path);
        try{
            for (File low : file.listFiles()){
                if(low.getName().contains(".java")){
                    System.out.println(low.getName());
                    FileReader fir = new FileReader(low);
                    BufferedReader br = new BufferedReader(fir);
                    String data = "";

                    FileWriter fw = new FileWriter(low.getPath(), false);
//                    fw.write(message); //작성 메소드
                    while(true){
                        data = br.readLine();
                        if(data != null){
                            if(!data.contains(delete_line)){ //만약 찾고 있는 내용이 있다면.
                                fw.write(data);
                            }
                        } else{
                            System.out.println();
                            break;
                        }
                    }
                }
            }
        } catch (NullPointerException | FileNotFoundException ex){
            System.out.println("File 없음 ㅅㄱ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
