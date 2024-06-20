package Java_240620;

public class MyThread extends Thread {
  private String name;

  public MyThread(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println(this.name);
    super.run();
  }
}
