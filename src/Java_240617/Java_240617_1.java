package Java_240617;

public class Java_240617_1 {
  public static void main(String[] args) {
    Java_240617_Phone applePhone = new Java_240617_ApplePhone();
    // 애플폰이 폰을 인터페이스로 받았기 때문에 폰 타입을 가지고 애플폰이 구현체가 될 수 있다.
    // 본인의 클래스를 호출하는 것이 아닌 상위 클래스를 호출하여 생성자를 만든다.

    Java_240617_Phone samsungPhone = new Java_240617_SamsungPhone();

    System.out.println(applePhone.call());
    System.out.println(samsungPhone.answerThePhone());
    System.out.println(applePhone.call());
    System.out.println(samsungPhone.answerThePhone());
  }

  // 구현체에서 구현한 코드들이 인터페이스를 통해 가져와지므로 인터페이스를 잘 설계해도 코드가 공통적으로
  // 사용되므로 유지보수에 용이하다.
  // 인터페이스의 구현은 강제성을 가지고 있어 결과적으로 인터페이스를 반드시 상속받는다면 반드시 구현해야 하므로
  // 제약사항이며, 코드를 실행할 때는 메서드를 호출하는 것이 아닌, 인터페이스의 메서드를 호출하며
  // 중앙제어가 가능하다. 또한 실행 시 코드에서 각각 오버라이딩 할 필요가 없어
  // 효율적이다.

}
