package Java_240530;

public class Test_240530_6 {

  public static void main(String[] args) {
//    int a = 10 + 220;
//    System.out.println(a);
    // float 타입 변수 선언과 초기화
    float myFloat = 9.75f; // 숫자 뒤에 'f'를 붙임

    // float를 사용한 계산
    float anotherFloat = myFloat * 2;

    // 결과 출력
    System.out.println("Original float value: " + myFloat);
    System.out.println("Calculated float value: " + anotherFloat);
    //형변환이 가능하나 이는 신중히 해야함, 입력된 값이 문자열일수도 있으므로 int 사용이 안될 수도
    //형변환의 이유 런타임오류는 개발자가 예상할 수 없으므로 치명적임 사용자가 숫자가 아닌 문자열을 입력했을 때
    // 형변환 불가능
  }
}
