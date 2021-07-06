package com.irinaliz.study_diary.b06_jun.day14;

import java.io.*;

public class Assignment {
    public static void main (String[] args) throws IOException {
        String path = "c:/Temp/20141125"; //파일이 위치한 경로
        File file = new File(path); // 파일을 선택해서 이걸 변수화함
        String message = ""; //이건 파일 1개만 생성되야 하고, 편명을 저장해둘 저장소가 필요해서.
        for (File files : file.listFiles()){ //해당 파일의 목록을 가져와서 1개씩 파일 변수를 만들어주고
            if( (files.getName().contains(".text") || files.getName().contains(".txt"))){ //가져온 변수에 확장자가 맞는지 체크하고
                FileReader fr = new FileReader(files.getPath()); //변수파일을 char타입으로 싹 읽은다음에
                BufferedReader br = new BufferedReader(fr); // char을 차곡차곡모아서 1줄로 만듬.
                String data = ""; // buffer 저장소
                while(true){ // 돌려돌려 계속 돌려
                    data = br.readLine(); //차곡차곡 모아 만들어진 1줄을 data에 넣음
                    if(data != null) { //만약 Data가 있으면?
                        if(data.contains("/AN")) { //그 데이터 문자열에서 /AN 이란게 있는지?
                            message += data.split("/AN")[1] +"\n";} //있다면 /AN기준으로 오른쪽 데이터를 가져와서
//                                                                          message에 추가해서 넣음
                    } else break; //이제 Data가 없으면 다음 파일로 넘어감
                }  // While
            } // IF
        } // for
        FileWriter fw = new FileWriter(file.getPath()+".txt",false);
        // 이제 message에 모인 문자열을 사용하기 위한 텍스트 파일을 하나 생성
        fw.write(message);
        // 파일에 모아놓은 문자열을 기입
        fw.close();
        //저장하고 마무리
    }
}
