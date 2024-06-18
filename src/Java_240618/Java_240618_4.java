package Java_240618;

import java.util.ArrayList;
import java.util.List;

public class Java_240618_4 {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Spring");
        arrayList.add("Servlet/JSP");
        arrayList.add("DBMS");
        arrayList.add("JPA");

    System.out.println("총 객체 수: " + arrayList.size());

    System.out.println("==============");

    System.out.println("두 번째 인덱스: " + arrayList.get(2));

    //foreach문
    for(String str : arrayList){
      System.out.println(str);
    }

    System.out.println(arrayList.contains("java")); //false - 대소문자 구분
    //contains 요소 있는지 없는지 확인함

    //배열에 null 값이 있을 때, isEmpty는 false, null도 값이 있는 것
    //오브젝트 클리어 사용하고 이즈앰티 사용하면 true나옴 - 클리어로 내부의 값을 전부 지워버림
    }
}
