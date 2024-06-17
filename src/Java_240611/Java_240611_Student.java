package Java_240611;

// Student 클래스
public class Java_240611_Student {
  int level; //멤버 변수 (클래스의 상태)

  // 생성자
  public Java_240611_Student() {
    this.level = 1; // student가 뉴로 만들어질때는 1로 초기화 된다.
    // 아무런 값을 넣지 않았기 떄문
  }

  // 메서드(기능)
  public void levelUp() {
    level++;
    System.out.println("레벨이 1증가 했습니다.");
    System.out.println("현재 레벨은 = " + level + " 입니다.");

    // 레벨업 메서드는 보이드 이므로 반환값이 없다.
  }

  public void levelDown() {
    //level = level > 2 ? --level : level; //삼항연산자
    if (level > 1) {
      level--;
    } else {
      System.out.println("레벨이 더이상 감소할 수 없습니다.");
    }

    System.out.println("레벨이 1감소 했습니다.");
    System.out.println("현재 레벨은 = " + level + "입니다.");
  }
}
