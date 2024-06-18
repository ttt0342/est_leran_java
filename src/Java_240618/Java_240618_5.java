package Java_240618;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Java_240618_5 {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    List<String> linkList = new LinkedList<>();

    long startTime, endTime;
    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      arrayList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("arrayList 걸린시간: " + (endTime - startTime));

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      linkList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("linkList 걸린시간" + (endTime - startTime));
  }
}

//인덱스 0번에 추가하는 것은 어레이리스트가 시간이 더 짧게 나온다.