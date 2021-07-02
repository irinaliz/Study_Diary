package com.irinaliz.study_diary.b06_jun.day12.Regex;

import java.sql.PreparedStatement;

public class Test1 {
    public static void main(String[] args){
        String title = "abc"; //a를 넣든 abc를 넣든 true , 공백이면 false
        String pattern =".+"; // . -> 임의의 한 문자, + 문자가 하나 이상이면 => 아무 문자가 하나 이상이면 true.

//        System.out.println(title.matches(pattern)); // true

        String color = "red";
        String pattern1 = "^red.*";
//        ^ 문자열 시작 , . 아무 문자 , * 앞 문자가 무한정 많을수도, 없을수도 *: (0개 이상)
//         => red라는게 시작 부분에 있으면 true, 만약 "abcred"라면 false.
//         red라는 단어로 시작하고 아무 문자가 0개 이상.
//        System.out.println(color.matches(pattern1));

        String pattern2 = "^red.?";
//        ^ 문자열 시작점에 red라는게 있으면 true, red 이후 한글자가 있으면 true, red 이후 두글자 이상이면 fasle
//        System.out.println(color.matches(pattern2));

        String color2 = "yellow";
        String pattern3 = "^(r|y|b).*";
//        ^ 문자열 시작점에 (r또는 y또는 b) 이면 true, 아니면 false , * 앞 문자가 무한정 많을 수 있다.

//        System.out.println(color2.matches(pattern3));

        String color3 = "yellow";
        String pattern4 = "^(r|y|b)";
//        ^ 문자열 시작점에 (r또는 y또는 b) 이면 true, 아니면 false
//        뒤에 .*을 지워버리면 r,y,b 중 한 알파벳만 있어야 true
//        . 아무문자가 * 무수히 많을수 있다. , and ^ 시작점에는 r y b 3개중에 1개라도 있어야한다.
//        System.out.println(color3.matches(pattern4));

        String numbers = "123456789";
        String pattern5 = "^[0-9]+$";
//        System.out.println(numbers.matches(pattern5));
//         문자열 시작과 끝점 내에 0-9중 1개 이상 있는지?
//         문자열의 시작부분부터 끝지점 직전까지 0~9중 한개라도 있는지 = ^[ ]+$

        String numbers1 = "";
        String pattern6 = "^[0-9]*$";
//        System.out.println(numbers1.matches(pattern6));
//        * 는 없거나 또는 무수히 많음이므로 공백이여도 true

        String test1 = "123-456-789-abc-ABCDEF";
        String pattern7 = "^[0-9]{3}-[0-9]{3}-[0-9]{3}-[a-z]{3}-[A-Z]{6}";
//        System.out.println(test1.matches(pattern7));

        String test2 = "1b3";
        String pattern8 = "^[0-9]{1}[a-z]{1}[0-9]{1}";
//        System.out.println(test2.matches(pattern8));
        //1b3은 패턴8의 규칙에 맞아 true, 13b는 규칙에 틀려 false


        String test3 = "1b3-ab2-123-가나다-가나다456";
        String pattern9 = "^[0-9]{1}[a-z]{1}[0-9]{1}-[a-z]{2}[0-9]{1}-[0-9]{3}-[가-힣]{3}-[가-힣]{3}[0-9]{3}";
//        System.out.println(test3.matches(pattern9));
        //개수가 정해져있을경우 이렇게.

        String email1= "test_@naver.com";
        String pattern10 = "^[a-zA-Z0-9][a-zA-Z0-9_-]*@[a-zA-Z0-9]*\\.[a-zA-Z]+$";
//        System.out.println(email1.matches(pattern10));
        //패턴 10처럼 [a~9][a~-_]를 하는 이유는 언더바나 지정해놓은 특수 문자가
        //앞에 있으면 안되게끔 하기위한 방법.

        String email2 = "t_@1.c";
//        System.out.println(email2.matches(pattern10));

        String user_number = "970517-1234567";
        String pattern11 = "^[0-9]{6}-(1|2|3|4)[0-9]{6}$";
//        System.out.println(user_number.matches(pattern11));

        String test4 = "공지사항 게시판 이미지";
        String pattern12 = ".*게시판.*";
//        System.out.println(test4.matches(pattern12));
//        앞에 .*이 붙는이유는 게시판 이란 글자 앞에 여러 아무문자가 많을 수 있기 때문에


        String test5 = "970517";
        String pattern13 = "([0-9]{2}) ([0-9]{2}) ([0-9]{2})";
        String result = test5.replace(pattern13,"$1-$2-$3");
//        System.out.println(result);


        String test51 = "970517";
        String pattern131 = "(\\d{2})(\\d{2})(\\d{2})";
        String result1 = test51.replaceAll(pattern131,"$1-$2-$3");
//        System.out.println(result1);

        String test6 = "97.123";
        String pattern14 = "^[0-9].*\\.[0-9].*$";
//        System.out.println(test6.matches(pattern14));
        String pattern15 = "^([0-9].*)\\.([0-9].*$)";
//        System.out.println(test6.matches(pattern15));

        int a = Integer.parseInt(test6.replaceAll(pattern15,"$1"));
        double b = Double.parseDouble(test6.replaceAll(pattern15, ".$2"));
        System.out.println(a);
        System.out.println(b);


        String test7 = "12345678.1234";
        String pattern16 = "[0-9]{0,8}\\.[0-9]{4}";
        System.out.println(test7.matches(pattern16));


        String test8 = "1234567.1234";
        String pattern17 = "[0-9]{6,8}\\.[0-9]{4}";
        System.out.println(test8.matches(pattern17));
    }
}
