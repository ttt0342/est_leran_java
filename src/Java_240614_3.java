import java.util.Scanner;

public class Java_240614_3 {
  // finally 블록
//  public static void main(String[] args) {
//    try {
//      int result = 10 / 0;
//      System.out.println(result);
//    } catch (NullPointerException e) {
//      System.out.println("0으로 나눌 수 없습니다.");
//    } finally { // 예외가 발생해도 실행된다.
//      System.out.println("이건 예외 여부와 상관없이 항상 실행됩니다.");
//    }
//    // 파이널리 사용하는 경우, 예외가 발생하더라도 무조건 실행돼야 하는 경우 (스캐너 실행 및 종료)
//  }

  //finally 사용 예시
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int i = scanner.nextInt();
      int result = i / 0;
      System.out.println(result);
    } catch (NullPointerException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      System.out.println("스캐너를 종료합니다.");
      scanner.close();
    }
  }
}
