public class Test_340531_3 {
  public static void main(String[] args) {
    //        int positive = 10;
    //        int negative = -10;
    //    System.out.println("양의 부호 연산자 적용:" +(+positive));
    //    System.out.println("음의 부호 연산자 적용:" +(-positive));
    //    System.out.println("음의 부호 연산자로 부호 반전: " +(+negative));
    //    System.out.println("음의 부호 연산자로 다시 부호 반전: " +(-negative));

    //    int x = 5;
    //    int y = 5;
    //
    //    System.out.println("전위 증가 연산자: " + (++x));  // 업데이트(증가) 후 x 출력 ++기준으로 생각하기
    //    System.out.println("후위 증가 연산자: " + (y++));  // y 출력 후 업데이트(증가)
    //
    //    System.out.println("======================");
    //    System.out.println("x는" + x);
    //    System.out.println("y는" + y);

    // 전위, 후위 감소 연산자 3번 반복
    //    int a = 100;
    //    int b = 100;
    //    System.out.println("전위 감소 연산자:" + (--a));
    //    System.out.println("후위 감소 연산자:" + (b--));
    //    System.out.println("전위 감소 연산자:" + (--a));
    //    System.out.println("후위 감소 연산자:" + (b--));
    //    System.out.println("전위 감소 연산자:" + (--a));
    //    System.out.println("후위 감소 연산자:" + (b--));

    boolean isRaining = true;

    if (isRaining) {
      System.out.println("하늘에서 비가 내려와요.");
    }
    if (!isRaining) {
      System.out.println("김태희가 안옵니다.");
    }

    boolean isSunny = false;

    if (!isSunny) {
      System.out.println("날씨가 맑아요.");
    } else {
      System.out.println("집에서 쉬어야죠.");
    }
  }
}
