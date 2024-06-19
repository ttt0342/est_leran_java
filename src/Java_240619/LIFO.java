package Java_240619;

import java.util.Stack;

public class LIFO {
  public static void main(String[] args) {
    Stack<LIFO_Coin> coinStack = new Stack<>();

    coinStack.push(new LIFO_Coin(100));
    coinStack.push(new LIFO_Coin(500));
    coinStack.push(new LIFO_Coin(10));
    coinStack.push(new LIFO_Coin(50));

    while (!coinStack.isEmpty()) { // 객체가 있는 동안, 비어있지 않은 동안 반복
      LIFO_Coin pop = coinStack.pop();
      // 50이 뽑힘 , 이떄 peek 넣는다면 무한반복(객체가 삭제되지 않으므로)
      System.out.println(pop.getValue());
    }
  }
}
