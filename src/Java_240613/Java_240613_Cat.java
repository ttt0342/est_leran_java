package Java_240613;

public class Java_240613_Cat extends Java_240613_Animal2 {
//실체 클래스

  public Java_240613_Cat() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("야옹");
  }
}
