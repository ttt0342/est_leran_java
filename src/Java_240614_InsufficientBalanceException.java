public class Java_240614_InsufficientBalanceException extends Exception {
  //커스텀 예외 , throwable = 예외, 에러 포함 최상위
  //잔액 부족은 런타임예외이므로 런타임예외도 사용할 수 있다.
  //익셉션을 상속받아서 커스텀 익셉션을 만들어 메세지를 보여주기 위한 목적으로 이렇게 작성함
  //터미널에 예외가 발생하면 예외를 메세지로 출력하기 위함이다.

  public Java_240614_InsufficientBalanceException(String message) { //생성자
    super(message);
  }
}
