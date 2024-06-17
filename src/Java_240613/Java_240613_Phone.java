package Java_240613;

public abstract class Java_240613_Phone {
  private String owner;

  public Java_240613_Phone(String owner) {
    this.owner = owner;
  }

  public void turnOn() {
    System.out.println("폰전원을 킵니다.");
  }

  public void turnOff() {
    System.out.println("폰전원을 끕니다.");
  }
}
