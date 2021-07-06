package com.irinaliz.study_diary.b06_jun.day14;

import java.io.*;

public class copyfile {
    public static void main(String[] args) throws IOException {
        String path = "c:/Temp";
        File file = new File(path);
        for(File files : file.listFiles()){
            if((files.getName().contains(".java") || files.getName().contains(".txt") || files.getName().contains(".text")) && files.canRead() ){
                String extension = files.getName().split("\\.")[1];
                FileReader fr = new FileReader(files);
                BufferedReader br = new BufferedReader(fr);
                String data = "";
                String message ="";
                while(true){
                    data= br.readLine();
                    if(data != null){
                        message += data+"\n";
                    } else break;
                }
                FileWriter fw = new FileWriter(files.getPath().split("\\.")[0]+"_copy."+extension, false);
                fw.write(message);
                fw.close();
            }
        }
    }
}
