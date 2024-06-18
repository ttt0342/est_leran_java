package Java_240618;

import java.util.ArrayList;
import java.util.List;

public class Java_240618_3 {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    //        arrayList.add("홍길동"); //1개의 요소 들어감 어레이리스트에
    //        arrayList.add(1,"홍길동2"); //첫번쨰 인덱스에 홍길동2을 추가한다.
    //
    //        String s = arrayList.get(0);  //저장
    //        arrayList.remove(1);    //삭제

    arrayList.add("홍길동");
    arrayList.add("홍길동2");
    arrayList.add("홍길동2");
    arrayList.add("홍길동2");
    arrayList.add("홍길동2");
    arrayList.add("홍길동2");

    arrayList.remove("홍길동2");
    //중복된 값이 있다면 처음 찾은 것 하나만 삭제된다. 왼쪽부터 오른쪽으로 삭제된다.
    //배열 전체를 삭제하고자 할 때
    arrayList.removeIf((s)-> s.equals("홍길동2"));

    //for문
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }

    System.out.println("====================");

    // 향상된 for문(foreach)
    // (타입 변수 : 순회할 리스트)
    // 배열 전체를 출력할 떄는 인덱스가 필요없기 떄문에 향상된 for문 사용
    for (String str : arrayList) {
      System.out.println(str);
    }
  }
}
