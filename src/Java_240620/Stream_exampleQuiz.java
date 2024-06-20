package Java_240620;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_exampleQuiz {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> collect =
        numbers.stream().filter(integer -> integer % 2 == 1).collect(Collectors.toList());
    System.out.println(collect);

    // 예제 2,3은 각자 풀어보기


    //구현 문제
    // 정수 리스트에서 홀수만 필터링하여 출력하는 프로그램을 람다 표현식을 사용하여 작성하세요.
    List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    num.stream()
        .filter(integer -> integer % 2 == 1)
        .forEach(integer -> System.out.println(integer));

    // 문자열 리스트에서 길이가 5 이하인 문자열만 출력하는 프로그램을 람다 표현식을 사용하여 작성하세요.
    List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
    words.stream()
        .filter(String -> String.length() <= 5)
        .forEach(String -> System.out.println(String));
  }
}
