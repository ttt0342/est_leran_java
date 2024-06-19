package Java_240619;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Set3 {
  public static void main(String[] args) {
    Set<String> stringSet = new HashSet<>();

    stringSet.add("Java");
    stringSet.add("Spring");
    stringSet.add("JSP");
    stringSet.add("Java"); // 중복
    stringSet.add("DBMS");

    System.out.println(stringSet.size()); // 4개 출력된다. 자바가 중복되므로

    stringSet.remove("Java"); // 3개 된다.
    // iterator는 매개변수가 없어 next를 호출하여 삭제한다.

    Iterator<String> iterator = stringSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      //순서가 계속 바뀜, 순서보장이 되지 않는다.
    }

    //stringSet.clear(); //저장된 객체를 전부 삭제

    if(stringSet.isEmpty()){
      System.out.println("비었습니다.");  //clear 시
    }else {
      System.out.println("비지 않았습니다.");  //clear 안할 시
    }

    //set은 get이 없다. 순서가 없기 떄문에 인덱스로 접근할 수 없기 떄문이다.

    //특정객체에 접근해야 한다면
  }
}
