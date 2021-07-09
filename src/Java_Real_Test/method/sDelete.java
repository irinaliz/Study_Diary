package Java_Real_Test.method;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sDelete {
    public static void Delete(String path) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.print("삭제할 데이터 번호 >> ");
        String delete_str = scn.next();
        if (!Search.search(delete_str, path, true,false).exits) {
             System.out.println("중복데이터가 없습니다");
             System.out.println("데이터 삭제를 시작합니다.");

             FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr);

             String data = "";
             String msg = "";
             int number =0;
             while (true) {
                 data = br.readLine();
                 if (data != null) {
                     if (!data.split(":")[0].equals(delete_str)) {
                         number++;
                         msg += number+":"+(data.split(":")[1] + "\n");
                     }
                 } else break;
             }
             FileWriter fw = new FileWriter(path, false);
             fw.write(msg);
             fw.close();
             System.out.println("데이터가 삭제되었습니다.");
        } else {
            System.out.println("중복된 데이터가 존재 또는 데이터가 없습니다.");
        }
    }
}

