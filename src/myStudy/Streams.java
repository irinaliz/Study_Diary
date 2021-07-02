package myStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Streams {
    public static void main(String[] args){
        List<String> abc = new ArrayList<>();
        abc.add("a");
        abc.add("c");
        abc.add(" ");
        abc.add("b");
        abc.add(" ");
        abc.add("e");
        abc.add(" ");
        abc.add(" ");
        abc.add("d");
        abc.add("f");
        abc.add("g");

        abc.sort(null); // abc , 1,2,3 순으로 정렬
//        abc.sort(Comparator.reverseOrder()); // 리버스 정렬
//        abc.sort(Comparator.naturalOrder()); //?
        abc.sort(Comparator.nullsLast(null)); //?


        abc.forEach(System.out::println);
        System.out.println();
        System.out.println();

        int[] abc1 = {-1,-2,2,10,20,50,25,182,-12,-1842};
        Arrays.sort(abc1);
        System.out.println(abc1[0]);
        System.out.println(abc1[abc1.length-1]);

        List<Integer> abcs= new ArrayList<>();

        System.out.println( Math.random()*100 );


    }
}
