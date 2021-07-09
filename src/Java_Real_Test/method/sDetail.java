package Java_Real_Test.method;

import java.io.IOException;
import java.util.Scanner;

public class sDetail {
    public static void Detail(String path) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.print(" 검색 이름을 입력해주세요 >> ");
        String name = scn.next();
        Search sear = Search.search(name,path, false,true);
        if(sear.exits){
            String[] arr = sear.user.split("/");
            System.out.println(" 코드 : " + arr[0].split(":")[0]);
            System.out.println(" 학생명 : " + arr[0].split(":")[1]);
            System.out.println(" 생년월일 : " + arr[1]);
            System.out.println(" 핸드폰 번호 : " + arr[2]);
        }else {
            System.out.println("아무 데이터도 찾지 못했습니다.");
        }

    }

}
