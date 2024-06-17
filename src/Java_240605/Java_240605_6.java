package Java_240605;

import java.util.Scanner;

public class Java_240605_6 {
  public static void main(String[] args) {
    //        영화관에서 사용할 수 있는 간단한 티켓 예매 시스템을 만들어보세요. 이 시스템은 사용자로부터 다음과 같은 정보를
    //        입력받아야 합니다:
    //        1. 영화 제목 (문자열)
    //        2. 관람 인원 수 (정수)
    //        3. 예매자의 이름 (문자열)
    //        4. 예매자의 전화번호 (문자열)
    //        입력받은 정보를 바탕으로 다음과 같은 형식으로 예매 정보를 출력해야 합니다:
    Scanner scanner = new Scanner(System.in);
    System.out.println("영화제목을 입력하세요.");
    String movie = scanner.nextLine();

    System.out.println("관람인원을 입력하세요.");
    int people = scanner.nextInt();
    scanner.nextLine();

    System.out.println("예매자 이름을 입력하세요.");
    String name = scanner.nextLine();

    System.out.println("예매자의 전화번호를 입력하세요");
    String phone = scanner.nextLine();

    System.out.println("===== 영화 티켓 예매 정보 =====");
    System.out.println("영화 제목: " + movie);
    System.out.println("관람 인원: " + people + "명");
    System.out.println("예매자 이름: " + name);
    System.out.println("예매자 전화번호: " + phone);
    System.out.println("총 결제금액: " + 10000 * people + "원");

    scanner.close();
  }
}
