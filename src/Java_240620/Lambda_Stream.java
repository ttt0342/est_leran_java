package Java_240620;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lambda_Stream {
  //  public static void main(String[] args) throws InterruptedException {
  //
  //    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
  //
  //    callList(list);
  //  }

  //  public static void callList(List<Integer> integerList) {
  //    for (int i : integerList) {
  //      System.out.println(i);
  //    } // 리스트 출력
  //  }
  // 익명함수(람다) 위의 과정없이 출력이 가능하다.
  // 함수를 만들지 않아도 출력이 가능하다.

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    //반복문 사용해서 홀수만 출력하기
    //    Iterator<Integer> iterator = numbers.iterator();
    //
    //    while (iterator.hasNext()) {
    //      Integer next = iterator.next();
    //      if (next % 2 == 0) { // 짝수면 삭제해라
    //        iterator.remove();
    //      }
    //    }
    //    System.out.println(numbers); // 홀수만 출력된다. 이 모든 것을 메인말고 메서드에 넣으면 함수가 된다.

    // ==> 위의 코드가 밑의 한줄로 정리 된다.

    // 데이터가 담기는 것
    // 람다 표현식 사용
    // 간단하기는 하나 익명함수로 함수명이 없어 가독성이 떨어지므로 많이 사용하면 코드 해석이 어려워짐
    // 간단한 것은 람다 표현식으로 표현 가능
    numbers.removeIf((integer) -> integer % 2 == 0); // 괄호 안에 매개변수를 넣어야 한다. 순회할 때 사용할 수 있는 변수명

    System.out.println(numbers);

  }
}
