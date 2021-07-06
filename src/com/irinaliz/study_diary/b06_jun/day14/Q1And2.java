package com.irinaliz.study_diary.b06_jun.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class Q1And2 {
    public static void main(String[] args) throws Exception{
        String path = "c:/Temp";

        File file = new File(path);
/*
        String[] lit = file.list();
        for (String str : lit){
            if(str.contains(".txt")){
                File low_file = new File(path + "/" + str);
                low_file.renameTo(new File((path+"/"+str).replace("txt","java")));
            }
            if(str.contains(".java")){
                File low_file = new File(path + "/" + str);
                System.out.println(low_file.getName());
                Files.copy(low_file.toPath(), file.toPath());
            }
        } */

        String org_file = "c:/Temp/message.java";
        String copy_file = "c:/Temp/message3.java";

        FileChannel in = new FileInputStream(org_file).getChannel();
        FileChannel out = new FileOutputStream(copy_file).getChannel();

        in.transferTo(0, (int)in.size(), out);
        in.close();
        out.close();
    }
}
