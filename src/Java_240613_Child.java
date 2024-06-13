public class Java_240613_Child extends Java_240613_Parent {
  void method2() { // 자식클래스에서 부모의 클래스를 재정의함, 아이콘 확인하기
    System.out.println("Child의 메서드2 호출");
  }

  void method3() { // 상속받은 것이 아니므로
    System.out.println("Child의 메서드3 호출");
  }
}
