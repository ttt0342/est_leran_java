public class Java_240614_7 {
  public static void main(String[] args) {
    //        다음은 어떤 동물원의 사육사가 하는 일이다.
    //
    //        난 동물원(zoo)의 사육사(zookeeper)이다.
    //        육식동물(predator)이 들어오면 난 먹이를 던져준다(feed(행위(=메서드))).
    //        호랑이(tiger)가 오면 고기(meat)를 던져준다.
    //        사자(lion)가 오면 생선(fish)를 던져준다.

    Java_240614_ZooKeeper zooKeeper = new Java_240614_ZooKeeper();

    // 동물이 늘어난다면 계속 새로운 메서드를 만들어주어야 하므로 비효유적
    // 이를 인터페이스로 해결할 수 있다.
    Java_240614_Tiger tiger = new Java_240614_Tiger();
    zooKeeper.feed(tiger);

    Java_240614_Lion lion = new Java_240614_Lion();
    zooKeeper.feed(lion);

    Java_240614_Rabbit java240614Rabbit = new Java_240614_Rabbit();
    zooKeeper.feed2(java240614Rabbit);

    Java_240614_Deer java240614Deer = new Java_240614_Deer();
    zooKeeper.feed2(java240614Deer);
  }
}
