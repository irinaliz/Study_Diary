package Java_Real_Test.method;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class sList {
    public static void sList(String path) throws IOException {
        System.out.println("   이름     출생년도      핸드폰");
        System.out.println("----------------------------------------------");
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String data = "";
        while (true){
            data = br.readLine();
            if(data != null){
                String[] arr = data.split("/");
                System.out.println("   " + arr[0].split(":")[1] + "   " +arr[1].split("-")[0]+"년생" + "   " + arr[2]);

            } else break;
        }
    }
}
