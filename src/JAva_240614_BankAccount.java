public class JAva_240614_BankAccount {
  // 계좌
  private int balance; // 잔액

  public void withdraw(int amount) throws Java_240614_InsufficientBalanceException {
    // 예외 커스텀 - 자바에 없는 예외처리 기능 만들기
    //throws 사용하면 메서드에서 발생하는 체크드예외를 사용자에게 알리기 위해서

    if (balance < amount) { // 잔액이 부족하다.
      // 메서드 내부에서 throws 사용 위해서 new로 선언
      // 메서드 내부에서 throw, 메서드 레벨에서는 throws
      throw new Java_240614_InsufficientBalanceException("잔액이 부족합니다."); //f2 누르고 알트 엔터(클래스 생성)
    }
    balance -= amount;
  }
}
