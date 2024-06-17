package Java_240613;

public class Java_240613_InheritA {
    int field1;
    private int s1;

    void method1() {
      System.out.println("InheritA.method` field1 = " + field1);
    }

    private void method3() { //프라이빗이기 떄문에 상속되지 않는다.
      System.out.println("이것은 프라이빗");
    }

//  //parents 클래스
//  int money;
//
//  public void bank() {
//    this.money += 10000;
//    System.out.println("금액 = " + this.money);
//  }
}
