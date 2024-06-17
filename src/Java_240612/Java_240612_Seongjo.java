package Java_240612;

public class Java_240612_Seongjo {
  int weight;
  int money;
  boolean fat;

  public Java_240612_Seongjo(int weight, int money) {
    this.weight = weight;
    this.money = money;
    this.fat = false;
  }

  public void buyFood(Java_240612_Food food) {
    this.money -= food.cost;
  }

  public void eatFood(Java_240612_Food food) {
    this.weight += food.weight;
    if (this.weight >= 150) {
      this.fat = true;
    }
  }
}
