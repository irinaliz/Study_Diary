package java_test;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:/Temp/hans_file";
        String file_name = "memberDb.txt";
        File file = new File(path+"/"+file_name);

        Scanner scn = new Scanner(System.in);
        System.out.println("내가 찾고자 할거 입력하십쇼 >> ");
        String search = scn.nextLine();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String msg = "";
        String data = "";

        while(true){
            data = br.readLine();
            if(data != null){ //있으면 데이터를 갖고오는데
                System.out.println(data);
                if(data.indexOf(scn.next()) < 0) {
                    msg += data+"\n";
                    System.out.println(search + "이 없어서 msg에 넣겠읍니다");
                }
                else {
                    System.out.println(search + "이 있읍니다. 그럼 이거 저장 안하겠읍니다");
                }
            }
            else {
                break;
            }
        }
//        FileWriter fileWriter = new FileWriter(file.getPath(), false);
//        fileWriter.write(msg);
//        fileWriter.close();
    }
}
