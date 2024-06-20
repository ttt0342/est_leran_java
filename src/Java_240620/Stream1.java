package Java_240620;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 10, 9, 5, 20));
    //        //스트림으로 만들기
    //        numbers.stream();
    //
    //        int[] array = {1,2,3,4,5};
    //        IntStream stream = Arrays.stream(array);
    //
    //        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

    //        //중간연산자
    //        //중간연산을 수행하는 메서드
    //        //중산 연산과 최종연산까지 호출해야 실행 가능
    //        numbers.stream().filter(integer -> integer % 2 == 0);
    //        //filter: 조건에 맞는 요소로 스트림을 생성
    //        //짝수값을 요소에 포함하는 조건
    //
    //        //이렇게 만들면 호출 안됨, 최종연산을 수행하는 특정 메서드가 없기 때문에
    //        //이를 지역변수로 놓으면 스트림 상태인 것
    //
    //        numbers.stream().map(integer -> integer * 2);
    //        //각 요소에 *2를 해준다.
    //        numbers.stream().sorted();
    //        //요소를 정렬한다.(대부분 오름차순 정렬)
    //
    //        //최종 연산
    //        //최종 연산이 수행되면 스트림이 닫힌다.
    //     //foreach
    //    numbers.stream()
    //        .filter(integer -> integer % 2 == 0)
    //        .forEach(integer -> System.out.println(integer));
    // 필터로 짝수 거르고 중산연산, 최종연산해서 최종값 출력
    // 중간연산을 많이 사용할 수 있다.
    // 요구사항이 많을 떄, 특정 데이터를 조정할 때 많이 사용한다.

    //     //collect
    //    List<Integer> collect = //기존의 넘버스와는 관련이 없는 새로운 배열이다.
    //        numbers.stream()  //스트림은 원본 배열 자체를 건들지 않는다. 체인처럼 연산이 이루어짐
    //            .filter(integer -> integer % 2 == 0)
    //            .collect(Collectors.toList()); // 지역변수 삽입 후 스트림에서 벗어남
    //    //리스트화 한 것을 콜렉트로 수집한 것, 리스트화 한다. 스트림을 리스트화 했다.
    //    for (int i : collect) {
    //      System.out.println(i);
    //    }

    numbers.stream().sorted().forEach(integer -> System.out.println(integer));
    //오름차순 정렬

//    //reduce
//    numbers.stream().map(integer -> integer * 2);
  }
}
