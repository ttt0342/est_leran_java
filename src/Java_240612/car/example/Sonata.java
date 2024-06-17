//package Java_240612.car.example;
//
//import Java_240612.car.Car;
//
//public class Sonata extends Car {// extends 확장하다, car를 sonata가 상속
//
//  public static void main(String[] args) {
//    Sonata sonata = new Sonata();
//    System.out.println(sonata.company);
//    // 상속받았기 때문에 사용가능
//    //접근제어자를 프로텍티드에서 디폴트로 바꿨는데 오류발생함
//    //소나타와 카는 위치가 다르다. (패키지가 다르다.)
//    //디폴트는 같은 패키지 안에서 접근이 가능하다.
//    //단, 프로텍티드는 패키지가 달라도 자식클래스(상속)까지는 받을 수 있다.
//    //디폴트보다 프로텍티드가 유연하다.
//  }
//}