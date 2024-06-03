public class Java_240603_6 {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    boolean result1 = (a > 5) && (b < 10); // true
    boolean result2 = (a > 5) || (b > 10); // true , or로 묶었으므로 하나만 참이어도 true
    boolean result3 = !(a > 5); // !true = false
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);

    // 연산자를 통해 최종적인 true, false를 뽑아내는 것

    int three = 3;
    int five = 5;
    int two = 2;

    boolean result = (five > three) || (five < two) && (five < three);
    // true || false && false => 트루가 앞에 있고 OR가 있기 때문에 무조건 트루가 나옴 뒤에 뭐가 되었든
    // 하나라도 트루가 있기 때문에 OR로 인해 true가 나온다.
    // OR, AND 중 연산자 중에서 우선순위를 가지고 있는 것은 AND이므로 true or false 는 true이므로 우선순위
    // 우선순위를 무시하고 싶다면 괄호를 이용해 묶어야 한다.

    System.out.println(result);

    // 당신은 세 개의 불리언(boolean) 변수 x, y, z를 가지고 있습니다. 이 변수들에 대해 다음 조건을 만족하는 프로그램을 작성하세요:

    boolean x = true;
    boolean y = false;
    boolean z = true;

    //x가 true이고, y가 false일 때, "조건 1 충족"을 출력
    if (x && !y) { //y가 false이므로 값이 true로 나타내므로
      System.out.println("조건1충족");
    }

    //y와 z 둘 다 true이거나, x와 z 둘 다 false일 때, "조건 2 충족"을 출력
    if ((y && z) || (!x && !z)) {
      System.out.println("조건2충족");
    }

    //x, y, z 중 하나라도 true이면 "적어도 하나는 참"을 출력합니다.
    if (x || y || z) {
      System.out.println("적어도 하나는 참");
    }

    //세 변수 모두 false일 때, "모두 거짓"을 출력
    if (!x && !y && !z) {
      System.out.println("모두 거짓");
    }
  }
}
