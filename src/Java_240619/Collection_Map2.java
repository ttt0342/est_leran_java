package Java_240619;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collection_Map2 {
  public static void main(String[] args) {
    Map<String, List<String>> map = new HashMap<>();
    ArrayList<String> stringList = new ArrayList<>();

    stringList.add("홍길동");
    stringList.add("홍길동");
    stringList.add("홍길동");
    map.put("키1", stringList);

    Set<Entry<String, List<String>>> entries = map.entrySet();

    for (Entry<String, List<String>> entry : entries) {
      String key = entry.getKey();
      List<String> value = entry.getValue();
      System.out.println(key);
      System.out.println("==============");
    }
  }
}
