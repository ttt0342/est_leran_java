package Java_240614;

import java.util.Scanner;

public class Java_240614_6 {
  public static void main(String[] args) {
    //        사용자로부터 정수 배열의 크기와 배열 요소를 입력받아 배열을 생성하는 프로그램을 작성하세요.
    //        이때, 입력된 인덱스가 배열의 크기를 벗어나면 ArrayIndexOutOfBoundsException을 처리하여
    //        적절한 메시지를 출력하세요.

    //    Scanner scanner = new Scanner(System.in);
    //    System.out.println("배열의 크기를 입력하세요");
    //    int i = scanner.nextInt();
    //    System.out.println("인덱스 값을 입력하세요.");
    //    int a = scanner.nextInt();
    //    int[] arr = new int[i];
    //    try {
    //      for (i = 0; i >= a; i++) {
    //        arr[i] = i;
    //      }
    //    } catch (ArrayIndexOutOfBoundsException e) {
    //      System.out.println("배열의 인덱스 값을 벗어났습니다.");
    //    } finally {
    //      scanner.close();
    //    }

    // 풀어보기
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("배열의 크기를 입력하세요: ");
      int size = scanner.nextInt();

      int[] arr = new int[size]; // 입력받은 크기로 배열 생성

      System.out.println("배열 요소를 입력하세요:");
      for (int i = 0; i < size; i++) {
        System.out.print("arr[" + i + "] = ");
        arr[i] = scanner.nextInt(); // 입력받은 배열 만들기
      }

      // foreach 사용가능 (배열의 출력이라면)

      // 출력
      System.out.println("배열 출력:");
      for (int i = 0; i < size; i++) { //size +2 하면 예외 발생
        System.out.println("arr[" + i + "] = " + arr[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
      // ArrayIndexOutOfBoundsException 처리
    } finally {
      scanner.close(); // scanner 자원 해제
    }
    //예외가 발생하는 코드가 아님, 예외처리를 하는 것, 예외를 발생시켜야 하는 것이 아님
  }
}
