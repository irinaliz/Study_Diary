package com.irinaliz.study_diary.b06_jun.day12.test.Quiz;

import com.irinaliz.study_diary.b06_jun.day12.test.implement.Q5_BankServicelmpl;

import java.util.Scanner;

public class Q5 extends Q5_BankServicelmpl {

    public Q5(String passwd){
        super(passwd);
    }
    public void Service_Start(){
        Scanner scn = new Scanner(System.in);
        System.out.println(" Ezen 디지털 은행에 오신 것을 환영합니다.");
        boolean start_boolean = passwd_confirm();
        while (!start_boolean) start_boolean = passwd_confirm();
        do{
            for(int a = 1 ; a<300; a++){
                System.out.println();
            }
            System.out.println(" 원하시는 서비스의 번호를 입력해주세요.");
            System.out.println(" 1. 입금 \n 2. 출금 \n 3. 잔액 \n 4. 비밀번호 재설정 \n 번호 선택>>");
            switch (scn.nextInt()){
                case 1: moneyInput(); break;
                case 2: moneyOutput();break;
                case 3: moneyPrint(); break;
                case 4: resetPasswd();break;
            }
            System.out.println("서비스를 계속 하시겠습니까? (y / n)");
        } while (scn.next().equals("y"));
        System.out.println(" 감사합니다 안녕히 가세요.");
    }

}
