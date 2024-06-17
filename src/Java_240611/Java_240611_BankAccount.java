package Java_240611;

class Java_240611_BankAccount { //은행계좌, 계좌번호, 예금주, 잔액 즉, 멤버 변수
  private String accountNumber;
  private String ownerName;
  private double balance;

  // 계좌 생성자
  public Java_240611_BankAccount(String accountNumber, String ownerName) { //외부에서 파라미터
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = 0.0;  //계좌 잔액 초기화
  }

  //기능 3가지 - 입금, 출금, 잔액 조회
  // 입금 메소드
  public void deposit(double amount) {
    if (amount > 0) { //입금 금액이 0원 초과이어야 유효 (1원 이상)
      balance += amount;
      System.out.println(amount + "원이 입금되었습니다.");
    } else { //0원 이하라면
      System.out.println("유효하지 않은 금액입니다.");
    }
  }

  // 출금 메소드
  public void withdraw(double amount) {
    if (amount <= balance) { //잔액보다 출금금액이 작거나 같아야
      balance -= amount;     //출금이 가능
      System.out.println(amount + "원이 출금되었습니다.");
    } else {
      System.out.println("잔액이 부족합니다.");
    }
  }

  // 잔액 조회 메소드
  public void printBalance() {
    System.out.println("현재 잔액: " + balance + "원");  //출금 후 금액포함하여 잔액 나타냄
  }
}
