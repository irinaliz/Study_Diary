package com.irinaliz.study_diary.b06_jun.day14;

import java.io.*;

public class deleteLine {
    public static void main(String[] args) throws IOException {
        String str = "스폰지밥";
        String path = "c:/Temp"; //Temp라는 DIR를 가져오게끔 문자열 선언
        File file = new File(path); // DIR이 가져와진 상태
        for (File files : file.listFiles()){ //Temp에 존재하는 파일을 1개씩 가져옴
            if(files.getName().contains(".java") && files.canWrite()){ //해당 파일 이름의 .java가 있으면 && 작성이 가능한 파일 인 경우.
                String check_String = ""; // 일단 여기에 1줄씩 담아놓고, 체크를 함
                String data = ""; //만약 내가 찾는게 데이터가 아니라면? data에 넣어버림.

                FileReader fr = new FileReader(files.getPath()); //파일을 읽음 , char ,byte식으로 읽은상태
                BufferedReader br = new BufferedReader(fr); // char또는 byte식으로 읽은 객체를 Buffer에 넣어서 개행이 들어올 때 또는 꽉찼을때 출력
                while(true){
                    check_String = br.readLine(); //한줄씩 넣고서.
                    if(check_String != null) { //일단 null이 아닐경우
                        if (!check_String.contains(str)) { //만약 이 1줄라인에 내가 찾는 스폰지밥이 없으면?
                            data += check_String + "\n"; // data String열에다가 넣어버림.
                        }
                    } else break; //만약 null이라면 While 탈출
                }

                FileWriter fw = new FileWriter(files.getPath(), false); //해당 java파일의 경로에다가.
                fw.write(data); //작성해놓은 문구를 기입
                fw.close(); //그리곤 해당 파일작성 종료
            }
        }
    }
}
