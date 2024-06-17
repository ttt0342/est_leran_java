package Java_240614;

public class Java_240614_1 {
  public static void main(String[] args) {
    try {
      int result = 10 / 0;
      // 예외가 발생함 ArithmeticException - 숫자를 0으로 나눌수 없어 발생하는 예외
      System.out.println(result);
    } catch (ArithmeticException e) { // 변수명을 관례상 e로 넣음
      System.out.println("0으로 나눌 수 없습니다.");
    } // 예외 발생하지 않을 시 캐치문 실행 안됨
    System.out.println("정상적으로 종료되었습니다.");
  }
  // 예외 발생해도 캐치문을 통해 예외처리를 해주었기 떄문에 밖의 코드가 실행된다.
  // 예외 처리하면 비정상적 종료되지 않음
  // 컴파일러 입장에서 예외처리를 강제 하지 않았으며 개발자가 코드를 직접 작성하였으므로 언체크트 예외
  // 컴파일러 입장에서 개발자가 직접 핸들링하면 언체크드, 컴파일러가 강제하면 체크드
  //자바 프로그래밍 실행 중에 발생할 수 있는 예외는 예측할 수 있다. 그래서 컴파일러 입장에서는 일단 실행해줌
  //컴파일에서 에러가 발생하지 않음
  //개발자가 예측할 수 있는 것, 이를 통해 안전성, 신뢰성이 높아짐
  // => 언체크드
  //반대로 컴파일 시점에서 예외처리를 강제로 수행시키는 것이 체크드
}

// NullPointerException  //RuntimeException 상속 -> Exception 상속 -> Throwable 상속
