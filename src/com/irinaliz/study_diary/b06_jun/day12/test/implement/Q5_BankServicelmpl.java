package com.irinaliz.study_diary.b06_jun.day12.test.implement;

import com.irinaliz.study_diary.b06_jun.day12.test.interfaces.BankService;

import java.util.Scanner;

public class Q5_BankServicelmpl implements BankService {
    private int money;
    private String passwd;

    public Q5_BankServicelmpl(String passwd){
        this.passwd = passwd;
    }


    @Override
    public void moneyInput() {
        Scanner scn = new Scanner(System.in);
        boolean booleans = true;
        int money_clone = 0;
        while(booleans){
            System.out.print(" 입금액 >> ");
            money_clone = scn.nextInt();
            while(money_clone <= 0){
                System.out.println("# 0원 이상 입력해주십시오.");
                money_clone = scn.nextInt();
            }
            while (true){
                booleans = !passwd_confirm();
                if(!booleans){
                    break;
                } else System.out.println("# 다시 입력해주세요.");
            }

        }
        if(!booleans){
            this.money += money_clone;
            System.out.println("# "+ money + "원 입금되었습니다.");
            moneyPrint();
        } else {
            System.out.println("Error # 예상치 못한 오류로 입금 되지 않았습니다.");
        }

    }

    @Override
    public void moneyOutput() {
        Scanner scn = new Scanner(System.in);
        boolean booleans = true;
        int money_clone = 0;
        while(booleans){
            System.out.print(" 출금액 >> ");
            money_clone = scn.nextInt();
            while(money_clone <= 0){
                System.out.println("# 0원 이상 입력해주십시오.");
                money_clone = scn.nextInt();
            }
            if(money_clone > this.money){
                System.out.println("# 소유하신 금액보다 많은 출금액을 입력하셨습니다.");
                continue;
            }
            while (true){
                booleans = !passwd_confirm();
                if(!booleans){
                    break;
                } else System.out.println("# 다시 입력해주세요.");
            }

        }
        if(!booleans){
            this.money -= money_clone;
            System.out.println("# "+ money_clone + "원 출금되었습니다.");
            moneyPrint();
        } else {
            System.out.println("Error # 예상치 못한 오류로 출금 되지 않았습니다.");
        }
    }

    @Override
    public void moneyPrint() {
        System.out.println("# 현재 금액 : " + this.money + "원 입니다.");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void resetPasswd(){
        if(passwd_confirm()) {
            Scanner scn = new Scanner(System.in);
            System.out.println(" 새로운 비밀번호를 입력해주세요 >>");
            String pawd = scn.next();
            System.out.println(" 비밀번호 재확인을 위해 다시 입력해주세요 >>");
            String str = scn.next();
            boolean re_pawd = str.equals(pawd);
            while (!re_pawd){
                if(str.equals("Exit")) return;
                System.out.println(" 비밀번호 재확인을 위해 다시 입력해주세요 >>");
                str = scn.next();
            }
            this.passwd = pawd;
            System.out.println("패스워드 설정이 정상적으로 완료 되었습니다.");
            System.out.println(" 현재 패스워드 : " + this.passwd);

        }
    }

    public boolean passwd_confirm(){
        Scanner scn = new Scanner(System.in);
        System.out.print( " 비밀번호를 입력해주세요 >> ");
        String str = scn.nextLine();
        if(!str.equals(passwd)) System.out.println("# 암호가 틀렸습니다.");
        return str.equals(passwd);
    }

}
