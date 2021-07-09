package Java_Real_Test.method;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Search {
    String user;
    boolean exits;
    int number;

    public Search(String user, boolean exits, int number){
        this.exits = exits;
        this.user = user;
        this.number = number;
    }

    public static Search search(String str, String path, boolean delete, boolean detail) throws IOException {
        boolean exit = false;
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String data ="";
        int delete_number=0;
        int check = 0;
        int number = 1;
        List<String> list = new ArrayList<>();
        while (true){
            data = br.readLine();
            if(data != null){
                number++;
                if((data.contains(str)&&!delete&&!detail) ||
                        ((delete && data.split(":")[0].equals(str))) ||
                        (detail && data.split(":")[0].equals(str))){
                    check ++;
                    if(delete){
                        delete_number++;
                        System.out.println(data.split(":")[0].equals(str));
                        list.add(data);
                    } else {
                        exit = true;
                        break;
                    }
                }
            } else break;
        }
        if(delete_number==1&& !detail){
            System.out.println("데이터 1건을 찾았습니다.");
            exit = false;
        }
        if(delete_number>1&& !detail){
            list.forEach(System.out::println);
            System.out.println("검색된 데이터 " + list.size() + "건");
            exit = true;
        }
        if (check == 0&& delete == true && !detail){
            System.out.println("아무 데이터도 찾지 못했습니다.");
            exit = true;
        }
        return new Search(data, exit, number);
    }

    public static boolean name_check(String name){
        String pattern = "^[가-힣]{2,5}";
        return name.matches(pattern);
    }
    public static boolean birth_check(String birth){
        birth = birth.replaceAll("[!@#$%^&*()_=<;'/?>+,.]","-");
        String[] arr = birth.split("-");
        int[] lengths = {4,2,2};
        for(int a =0; a < arr.length ;a++){
            if(!(arr[a].length() == lengths[a])){
                arr[a] = "0"+arr[a];
            }
        }
        birth = arr[0]+"-"+arr[1]+"-"+arr[2];
        String pattern = "[0-9]{4}-(0|1)[0-9]{1}-[0-9]{1,2}";


        return birth.matches(pattern);
    }

    public static boolean phone_check(String phone){
        phone = phone.replaceAll("[!@#$%^&*()_=<;'/?>+,.]","-");
        String pattern = "^01(0|1|[2-9])-[0-9]{3,4}-[0-9]{3,4}";
        return phone.matches(pattern);
    }
}
