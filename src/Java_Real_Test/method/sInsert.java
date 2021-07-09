package Java_Real_Test.method;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class sInsert {
    public static void insert(String path) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.print("학생명 >>");
        String name ="";
        while(true){
            name = scn.next();
            System.out.println(name);
            if(Search.name_check(name)) break;
            else {
                System.out.println("이름의 조건이 맞지 않습니다. 다시 입력해주세요 .");
                System.out.print("학생명 >>");
            }
        }

        System.out.print("생년월일 >>");
        String birth ="";

        while(true){
            birth = scn.next();
            System.out.println(birth);
            if(Search.birth_check(birth)) break;
            else {
                System.out.println("생일의 조건이 맞지 않습니다. 다시 입력해주세요 .");
                System.out.print("생년월일 >>");

            }
        }

        System.out.print("핸드폰 번호 >>");
        String phone_number ="";
        while(true){
            phone_number = scn.next();
            System.out.println(phone_number);
            if(Search.phone_check(phone_number)) break;
            else {
                System.out.println("휴대폰 번호의 조건이 맞지 않습니다. 다시 입력해주세요 .");
                System.out.print("핸드폰 번호 >>");
            }
        }
        String pattern = "[!@#$%^&*()_=<;'/?>+,.]";
        String total = name+"/"+( birth.replaceAll(pattern, "-")+"/"+(phone_number.replaceAll(pattern,"-")));

        System.out.println(total);
        Search search = Search.search(total,path,false,false);
        if(!search.exits){ // 없으면 true
            FileWriter fw = new FileWriter(path,true);
            fw.write(search.number+":"+total+"\n");
            fw.close();
            System.out.println(" * 조회된 데이터가 없습니다.");
            System.out.println(" * 성공적으로 데이터를 생성하였습니다.");
            System.out.println(" * 검출데이터 : " +search.number );
        } else {
            System.out.println(" * 조회된 데이터가 있습니다.");
            System.out.println(" * 데이터를 생성하지 않았습니다.");
        }

    }
}
