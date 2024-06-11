import java.util.Scanner;

public class Java_240611_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //스캐너 - 사용자의 입력 받기

        // 계좌 생성
        System.out.print("계좌번호를 입력하세요: ");
        String accountNumber = scanner.nextLine(); //문자열 받음
        System.out.print("소유자 이름을 입력하세요: ");
        String ownerName = scanner.nextLine(); //문자열 받음
        Java_240611_BankAccount account = new Java_240611_BankAccount(accountNumber, ownerName);
        //BankAccount account 현재 0.0원

        // 입금 및 출금
        account.deposit(100000); // 예시 입금
        account.withdraw(50000); // 예시 출금
        //출금 금액이 입금 금액보다 크면 출금 실패

        // 잔액 조회
        account.printBalance();

        scanner.close(); //필수로 닫아주기
    }
}

//클래스 만들고, 인스턴스 생성, 스캐너 사용해서 입력받고, 아규먼트 이용해서 새로운 인스턴스 생성

//이제까지 배웠던 내용 나와있음