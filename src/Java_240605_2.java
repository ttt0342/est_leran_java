import java.util.Scanner;

// 이 코드에서 스캐너를 가져다 사용하겠다는 의미, 음영처리된 것은 사용하지 않아서
// 코드 안에서 스캐너 입력해도 추가됨  스캐너도 클래스

public class Java_240605_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //시스템상에 스캐너 넣었기 떄문에 입력받을 준비를 한다.

//    System.out.println("정수를 입력해주세요.");  //먼저 창에 띄운다.
//    int a = sc.nextInt(); //정수형이므로 형을 맞춰서 변수 지정해야 한다.정수를 받음,정수 입력 안할시 에러(exception)
//
//    System.out.println("제가 입력한 값은 " + a + "입니다.");

//    sc.close(); //자원을 끊어 메모리 효율성을 높인다.

    System.out.println("정수를 입력하세요.");
    int number = sc.nextInt();//타입을 선택할 때 오른쪽에 입력받을 수 있는 값의 유형이 나온다. 정수형
    sc.nextLine();
    System.out.println("문자열을 입력하세요.");

    String line = sc.nextLine();  //문자열

    System.out.println("정수는 " + number);
    System.out.println("문자는 " + line);

    sc.close();

    //sc를 많이 사용하지는 않는다. 보다 나은 기능이 많기 때문
  }
}
