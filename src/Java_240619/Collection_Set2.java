package Java_240619;

import java.util.HashSet;
import java.util.Set;

public class Collection_Set2 {
  public static void main(String[] args) {
    Set<String> stringSet = new HashSet<>();

    stringSet.add("okay");  //okay를 기준으로 해시코드를 만들어준다. 예)okay123
    stringSet.add("okay1"); //이 okay의 해시코드가 같다면 저장하지 않는다.
                            //해시코드 다르면 set에 들어갈 수 있다.

  }
}
