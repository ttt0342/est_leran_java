package Java_WeeklyQuiz_240620;

public class ShoppingMall {
  public static void main(String[] args) {

    Clothing clothing = new Clothing("바지", 30000, 3, "L");
    System.out.println("사이즈가 L 이상인 경우 : " + clothing.calculatePrice() + "원");

    Electronics electronics = new Electronics("핸드폰", 1000000, 3, "Apple");
    System.out.println("브랜드가 애플인 경우 : " + electronics.calculatePrice() + "원");

    Food food = new Food("피자", 20000, 15, 7);
    System.out.println("유통기한이 7일 이하인 경우 : " + food.calculatePrice() + "원");

    String[] product = {};
  }

  public void addProduct() {}

  public void removeProduct() {}

  public void displayProduct() {}
}
