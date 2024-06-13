public class Java_240613_Computer extends Java_240613_Calculator {

  // 알트 인서트 -> 컨트롤 + o
  @Override // 함수가 오버라이딩 된것을 알림, 항상 붙여야 함, = 에노테이션(어노테이션)
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle 메서드 실행");
    return Math.PI * r * r;
    // Math는 자바 내장 라이브러리 스태틱 파이널이다.(상수)
    // 정밀도 올라감
  }

  //  @Override
  //  void say() {
  //    System.out.println("hi");
  //  }
}
