package Java_240605;

import java.util.Random;
import java.util.Scanner;

public class Java_240605_5 {
  public static void main(String[] args) {
    // 사용자가 1부터 100 사이의 숫자를 맞추는 게임을 만들어 보세요. 프로그램은 먼저 1부터 100 사이의 무작위 숫자를 생성합니다.
    // 그런 다음 사용자에게 숫자를 입력하라고 요청합니다. 사용자가 숫자를 입력하면, 프로그램은 사용자가 입력한 숫자가 무작위로 생성된 숫자보다 높은지, 낮은지, 아니면
    // 정확히 맞는지를 알려줍니다.
    // 사용자가 정확한 숫자를 맞출 때까지 이 과정을 반복합니다. 숫자를 맞추면 "정답입니다!"라고 출력하고 게임을 종료합니다.
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    int i = random.nextInt(100) + 1;

    while (true) {
      System.out.println("1부터 100까지 숫자를 입력하세요.");  //보통 크고 작음 비교 후 else로 같은경우를 입력한다.
      int number = sc.nextInt();
      if (number > i) {
        System.out.println("더 작은 수를 입력하세요.");
      } else if (number < i) {
        System.out.println("더 큰 수를 입력하세요.");
      } else {
        System.out.println("정답입니다!");
        break;
      }
    }
    sc.close();
  }
}
