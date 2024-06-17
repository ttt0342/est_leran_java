package Java_240617;

public class Java_240617_2 {
  public static void main(String[] args) {
    Java_240617_InterfaceC impleC = new Java_240617_ImpleC();

    Java_240617_InterfaceA interfaceA = impleC;  //굳이 작성하지 않아도 됨
    // C는 A도 상속받았으므로 위의 것도 가능하다.
    interfaceA.methodA();
    System.out.println("=============");

    Java_240617_InterfaceB interfaceB = impleC;
    interfaceB.methodB();
    System.out.println("=============");

    impleC.methodA();
    impleC.methodB();
    impleC.methodC();

    //impleC는 C를 상속받음으로써 A. B, C를 전부 사용할 수 있다.
  }
}
