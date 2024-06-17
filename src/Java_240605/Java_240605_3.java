package Java_240605;

import java.util.Scanner;

public class Java_240605_3 {
  public static void main(String[] args) {
// 계절을 맞춰보세요!"라는 자바 프로그램을 작성해보세요.
// 사용자에게 1에서 4 사이의 숫자를 입력하라고 요청합니다.
// 각 숫자는 계절을 나타냅니다: 1은 봄, 2는 여름, 3은 가을, 4는 겨울입니다.
// 사용자가 숫자를 입력하면, 프로그램은 해당 계절의 이름을 출력해야 합니다. 만약 사용자가 1에서 4 사이의 숫자가 아닌 것을 입력하면, "잘못된 입력입니다!"라고
// 출력해야 합니다.
// 이 문제를 해결하기 위해 switch 문을 사용하세요.

    Scanner sc = new Scanner(System.in);
    System.out.println("계절을 맞춰보세요!");
    System.out.println("1~4를 입력하세요");
    int number = sc.nextInt();

    switch (number) {
      case 1:
        System.out.println("봄");
        break;
      case 2:
        System.out.println("여름");
        break;
      case 3:
        System.out.println("가을");
        break;
      case 4:
        System.out.println("겨울");
        break;
      default:
        System.out.println("잘못된 입력입니다.");
        break;
    }
    sc.close();
  }
}