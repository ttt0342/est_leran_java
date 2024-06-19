package Java_240619;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_Map5_Student {
  public static void main(String[] args) {
    Map<Student, Integer> studentIntegerMap = new HashMap<>();

    studentIntegerMap.put(new Student(1, "학생1"), 95);
    studentIntegerMap.put(new Student(2, "학생2"), 90);
    studentIntegerMap.put(new Student(3, "학생3"), 80);
    studentIntegerMap.put(new Student(4, "학생4"), 70);

    System.out.println(studentIntegerMap.size()); // 동등비교 시 같은 것은 포함 안함

//    Set<Entry<Student, Integer>> entrySet = studentIntegerMap.entrySet();
//    for (Entry<Student, Integer> entry : entrySet) {
//      Student key = entry.getKey();
//      Integer value = entry.getValue();
//      System.out.println(key.getNo() + " " + key.getName() + " " + value);
//    }

    //풀이
    Set<Entry<Student, Integer>> entries = studentIntegerMap.entrySet();
    for (Entry<Student, Integer> entry : entries) {
      String name = entry.getKey().getName();
      int no = entry.getKey().getNo();
      Integer value = entry.getValue();
    }
  }
}
