package Java_240619;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Set1 {
  public static void main(String[] args) {
    Set<Integer> integerset = new HashSet<>();
    integerset.add(1);
    integerset.add(2);
    integerset.add(3);
    integerset.add(4);
    integerset.add(5);

    Iterator<Integer> iterator = integerset.iterator();
    // 반복자로 반복에 대한 기능을 수행한다.
    iterator.hasNext(); // 크기만큼 반복 후 다음 값이 있는지 물어본다(boolean)
    // E - 엘리먼트 , 객체를 나타낸다.
    iterator.next(); // 다음 값을 출력한다.
    // hasnext와 next를 같이 사용한다.
    iterator.remove();
    // 삭제한다. while문이랑 자주 사용한다.

    // 반복 출력하기
    while (iterator.hasNext()) { // 반복자가 다음 값을 가지고 있는 동안 반복
      System.out.println(iterator.next());
    }

    while (iterator.hasNext()) {
      iterator.next(); // 바로 리무브 호출하면 뭘 지워야 하는지 모른다.
      iterator.remove(); // integerset이 다 지워져서 출력되지 않음
    }

    // iterator와 integerset이 연결되어 있다.

    // 일반적인 반복만 한다면 foreach 많이 사용한다.
    for (int a : integerset) {
      System.out.println(a);
    }

    //     System.out.println(integerset.size());
    //     integerset.get  //저장순서가 없으므로 인덱스로 접근해서는 안됨, get 안됨
    // 대신 반복자 iterator
  }
}
