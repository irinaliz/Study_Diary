package myStudy;

import java.util.*;
import java.util.stream.DoubleStream;

class Members implements Comparable<Members>{
    int age;
    int height;
    String name;
    public Members(){}
    public Members(int age) { this.age = age; }
    public Members(int age, int height) { this.age = age;this.height = height; }
    public Members(int age, int height, String name) { this.age = age;this.height = height;this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    /*

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
*/
    public void getA(){ System.out.println(age); }

    public void Creative(Members members){
        System.out.println(members.age);
    }
    @Override
    public int compareTo(Members o) {
        if(age == o.getAge()) return 0;
        else if(age > o.getAge()) return 1;
        else return -1;
    }
}

public class Stream_Sort {
    public static void main(String[] args){
        //생성자의 Primary key 기준으로 정렬하는게 오떨까
        List<Members> membersList =  Arrays.asList(new Members(17,170), new Members(19,180) , new Members(18,175), new Members(20,192));
        membersList.sort(null); // membersList.sort(Comparator.reverseOrder());
        membersList.forEach(members -> System.out.println(members.age)); //람다 함수 전달방식 System클래스에서 참조
        membersList.forEach(Members::getA); //Members 클래스에서 참조하여 getA메소드를 호출
        membersList.forEach((new Members())::Creative) ; //맴버리스트를 가져와서 그 정보로 맴버를 만듬 -> 다른걸 만들 수도 있겠지
    }
}

class Stream_array{
    public static void stea(){
//        List<Double> dou = DoubleStream.generate(

        DoubleStream is2 = new Random().doubles(100);
        is2.forEach( i -> {
            i +=1;
//            System.out.println(i);
        });

        List<Integer> abc = new ArrayList<>();
        List<Integer> a = Arrays.asList(new Integer[100]);
        a.forEach(i -> {
            abc.add(abc.size()+1);
        });

        abc.forEach(System.out::println);
    }

    public static void main(String[] args){
        /*
        List<Integer> arrays = Arrays.asList(new Integer[100]);
        arrays.forEach(System.out::println);
        arrays.forEach( i -> System.out.println(arrays.get(i)));
        */
//        stea();

        TestClass<Members , Integer> test = new TestClass<>(new Members(24,170,"고양이") , 1234);
        System.out.println( "나이:"+test.getKey().age + ", 키:" + test.getKey().height + ", 타입:" + test.getKey().name);
        System.out.println( "벨류값 : " + test.getValue());
        test.clear();
        Members me1 = new Members(1,2,"냥");
        Members me2 = new Members(2,23,"냥1");
        Members me3 = new Members(3,24,"냥2");

        test.put(me1,123);
        test.put(me2,25);
        test.put(me3,21);

        System.out.println(test.get(me1));
        System.out.println(test.get(me1));

        TestClass<Members, Integer> test3 = new TestClass<>();
        test3.put(me1,152);
        test3.put(me2,154);
        test3.put(me3,155);
        System.out.println(test3.get(me1));

    }
}
class TestClass<T, V> extends HashMap{
    private T Key;
    private V value;
    public TestClass() {
    }
    public TestClass(T type, V value) {
        this.Key = type;
        this.value = value;
    }
    public V gets(T type){ return value; }
    public T getKey() {return Key;}
    public void setKey(T type) { Key = type; }
    public V getValue() { return value; }
    public void setValue(V value) { this.value = value; }


}
