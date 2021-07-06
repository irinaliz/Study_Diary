package myStudy;

import java.util.*;
import java.util.stream.Collector;

public class ClassSort {

    public static void main(String[] args){

        List<Player> list = new ArrayList<>();
        list.add(new Player("bc",210)); //1번째값
        list.add(new Player("ac",120)); //2번째값 = a-b = 90 -> 양수 배출
        list.add(new Player("hc",820));
        list.add(new Player("cc",400));
        list.add(new Player("cb",400));

        list.sort(null); //작은순에서 큰순으로 정렬 , 인터페이스 Comparable(CompareTo 메소드)이 강제됨.
        list.sort(new revers()); //큰순에서 작은순으로 정렬, 인터페이스 Comparator(compare 메소드)가 강제됨.

        Collections.sort(list); //작은순에서 큰순으로 정렬
        Collections.sort(list ,(a,b) -> b.getScore() - a.getScore()); //b-a:큰순에서 작은 순 정렬
//                        1회성 람다문법                                  a-b:작은순에서 큰순정렬

        list.sort(new alpha());

//        Arrays.sort(list, Collections.reverseOrder());
        Player[] ps = {new Player("b",50), new Player("c",20) , new Player("q",30) , new Player("z",21) ,new Player("a",90) };
        Arrays.sort(ps,Collections.reverseOrder());
        for ( Player p : ps){
            System.out.println(p.score);
        }
//        list.forEach(  n ->  System.out.println(n.name + " : " +n.score));
    }
}
class Player  implements Comparable<Player> , Comparator<Player> {
    String name;
    int score;
    public Player(){} // 인터페이스 Comparator를 상속받아서 compare라는 메소드를 받음.
    public Player(String name, int score) { this.name = name;this.score = score; }

     @Override
    public int compare(Player o, Player t){ //Comparator
        return t.getScore() - o.getScore(); }
    @Override
    public int compareTo(Player o) { //Comparable
        return this.getScore() - o.getScore(); }
    public int getScore() { return score; }
}

class revers implements Comparator<Player>{
    @Override
    public int compare(Player o, Player t){
        return t.getScore() - o.getScore();
    }
}
class alpha implements Comparator<Player>{
    @Override
    public int compare(Player o1, Player o2) {
        char a = o1.name.charAt(0);
        char b = o2.name.charAt(0);
        return a - b;
    }
}
