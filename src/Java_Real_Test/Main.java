package Java_Real_Test;

import Java_Real_Test.method.sDelete;
import Java_Real_Test.method.sDetail;
import Java_Real_Test.method.sInsert;
import Java_Real_Test.method.sList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "c:/Java_Test";
        String filepath = path+"/DBFile.txt";
        File file = new File(path);
        if(!file.exists()) {
            file.mkdir();
            FileWriter fw = new FileWriter(filepath,false);
            fw.write("1:테스트/1999-12-13/010-1234-123\n");
            fw.close();
        }
        if(!new File(filepath).exists()) {
            FileWriter fw = new FileWriter(filepath,false);
            fw.write("1:테스트/1999-12-13/010-1234-1234\n");
            fw.close();
        }

        Scanner scn;
    mains:while(true) {
                try {
                    System.out.println("[ 회원 정보 관리 프로그램 ]");
                    System.out.println("1.등록  2.목록  3.상세  4.삭제  5.종료");
                    System.out.print("* 번호 선택 >> ");
                    switch (new Scanner(System.in).nextInt()){
                        case 1:
                            sInsert.insert(filepath); break;
                        case 2:
                            sList.sList(filepath); break ;
                        case 3:
                            sDetail.Detail(filepath); break;
                        case 4:
                            sDelete.Delete(filepath); break;
                        case 5:
                            break mains;
                        default:
                            System.out.println("잘못된 선택입니다"); continue;
                    }
                service:while(true){
                        System.out.println("서비스를 계속 이용하실 것 입니까? (y/n)");
                        scn = new Scanner(System.in);
                        String check_restart = scn.nextLine();
                        if(check_restart.equals("y")) continue mains;
                        else if (check_restart.equals("n")) break mains;
                        else {
                            System.out.println("잘못된 입력입니다.");
                            continue;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("잘못된 입력입니다.");
                }
            }
        System.out.println("감사합니다. 안녕히 가세요");
    }
}


