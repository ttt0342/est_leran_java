package Java_240614;

import java.util.Scanner;

public class Java_240614_5 {
  public static void main(String[] args) {
    // 사용자로부터 두 개의 정수를 입력받아 나눗셈을 수행하는 프로그램을 작성하세요.
    // 이때, 두 번째 정수가 0인 경우 ArithmeticException을 처리하여 적절한 메시지를 출력하세요.
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수를 입력하세요.");
    int a = scanner.nextInt();
    System.out.println("정수를 입력하세요.");
    int b = scanner.nextInt();
    try {
      System.out.println("a / b = " + a / b);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      scanner.close(); //되도록이면 파이널리 안에 스캐너 클로즈 작성하기
    }
  }
}
