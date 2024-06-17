package Java_240611;

public class Java_240611_2 {
  public static void main(String[] args) {
//    System.out.println(add(1, 2));
    System.out.println(sub(1, 2));
    System.out.println(mul(1, 2));
    System.out.println(div(1, 2));
  }

//  static int add(int a, int b) {
//    return a + b;
//    //    int sum = a + b;  //인라인화 시키라는 의미를 가짐
//    //    return sum;
//  }

  static int sub(int a, int b) {
    return a - b;
  }

  static int mul(int a, int b) {
    return a * b;
  }

  static int div(int a, int b) {
    return a / b;
  }
}
