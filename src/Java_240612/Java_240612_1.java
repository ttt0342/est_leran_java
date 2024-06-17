package Java_240612;

public class Java_240612_1 {

  public static void main(String[] args) {

    Java_240612_Seongjo seongJo = new Java_240612_Seongjo(100, 5000);
    Java_240612_Food food = new Java_240612_Food(50, 30, "사탕");

    seongJo.buyFood(food); // 4950

    System.out.println(seongJo.money);
    seongJo.eatFood(food); // 130
    seongJo.eatFood(food); // 160
    System.out.println(seongJo.weight); // 160
    System.out.println(seongJo.fat); // true
  }
}
