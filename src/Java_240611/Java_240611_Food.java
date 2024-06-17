package Java_240611;

public class Java_240611_Food {
  int food;

  public Java_240611_Food() {
    this.food = 10;
  }

  public void eatFood() {
    food--;
    if (food > 0) {
      System.out.println("음식을 1개 먹었습니다.");
      System.out.println("남은 음식: " + food);
    } else {
      System.out.println("음식을 다 먹었습니다.");
      System.out.println("남은 음식: " + food);
    }
  }

  public void makeFood() {
    food++;
    if (food <= 10) {
      System.out.println("음식을 만들었습니다.");
      System.out.println("남은 음식: " + food);
    } else {
      System.out.println("음식을 더이상 만들 수 없습니다.");
      System.out.println("남은 음식: " + food);
    }
  }
}
