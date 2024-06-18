package Java_240618;

public class Compare {
  //  public static void main(String[] args) {
  //    System.out.println(compare(1, 2)); // -1
  //  }

  public static <T extends Number> int compare(T t1, T t2) {
    // 넘버는 모든 숫자타입의 최상위, 추상클래스 , 상위 타입을 상속받는다.

    double v1 = t1.doubleValue();
    double v2 = t2.doubleValue();
    return Double.compare(v1, v2);
    // v1이 작으면 -1, 같으면 0, 크면 1(왼쪽기준으로 판단)

    // 오브젝트 상속 시
    //    double v1 = (double) t1;
    //    double v2 = (double) t2;
    //    return Double.compare(v1, v2);
  }

  public static void main(String[] args) {
    System.out.println(compareString("hello", "hello"));
  }

  public static <T extends String> String compareString(T t1, T t2) {
    //    if(t1.equals(t2)){
    //      System.out.println("okay");
    //    }else {
    //      System.out.println("no");
    //    }
    return t1.equals(t2) ? "okay" : "no";
  }
}
