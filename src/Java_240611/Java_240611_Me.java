package Java_240611;

public class Java_240611_Me {
  String name;
  int age;
  String adress;

  public Java_240611_Me(String name, int age, String adress) {
    this.name = name;
    this.age = age;
    this.adress = adress;
  }

  public void sayHello() {
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + adress);
  }

  public void eating(Java_240611_Food java240611Food) {
    java240611Food.eatFood();
  }

  public void cooking(Java_240611_Food java240611Food) {
    java240611Food.makeFood();
  }
}
