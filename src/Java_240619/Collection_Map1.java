package Java_240619;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class Collection_Map1 {
  public static void main(String[] args) {
//    Map<String, Integer> map = new HashMap<>();
    //        Map<?,?> map = new HashMap<>();
    Map<String, List<String>> map = new HashMap<>();
    ArrayList<String> stringList = new ArrayList<>();

    stringList.add("홍길동");
    stringList.add("홍길동");
    stringList.add("홍길동");
    map.put("홍길동", stringList);

    Set<String> strings = map.keySet(); //1개, set은 반복자로 바꿀 수있다.
    Iterator<String> iterator = strings.iterator();

    while (iterator.hasNext()){
      String next = iterator.next();
      List<String> stringList1 = map.get(next);
      System.out.println(stringList1);
    }



//    map.put("홍길동", 30);
//    map.put("홍길동", 40);  //같은 키로 다시 넣으면 값이 덮어씌워지므로 40 반환된다.
//    // 사이즈는 1, 키값을 기준으로 하므로
//
//    System.out.println(map.get("홍길동")); // 30 출력
//    System.out.println(map.remove("홍길동")); //키와 값을 모두 지우는데 지운 값만 반환한다. 즉, 40
    //remove는 밸류 값을 반환한다.

    //map은 키만 알면 바로 접근이 가능하여 많이 사용한다.
  }
}
