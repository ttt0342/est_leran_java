package Java_240620;

public class Thread_Runnable {
  //스레드
//  public static void main(String[] args) {
//    MyThread myThread = new MyThread("스레드");
//    MyThread myThread1 = new MyThread("스레드1");
//    MyThread myThread2 = new MyThread("스레드2");
//    MyThread myThread3 = new MyThread("스레드3");
//    MyThread myThread4 = new MyThread("스레드4");
//
//    myThread.start();
//    myThread1.start();
//    myThread2.start();
//    myThread3.start();
//    myThread4.start();
//  }
  // 순서대로 실행되지 않고 랜덤으로 실행된다.
  // 스레드의 특징은 순서대로 실행되지 않음
  //start 호출했을 때 동시에 전부 실행되는 것이 스레드의 특징
  //스레드는 어떤 공유된 데이터에 동시에 접근이 가능하기 때문에
  //만일 순차적으로 실행된다면 동시성 이슈가 발생하지 않을 것

  //runnable
  public static void main(String[] args) throws InterruptedException {
    //체크드 익셉션이므로 반드시 예외 처리를 해주어야 한다.
    Thread thread1 = new Thread(new MyRunnable(1));
    Thread thread2 = new Thread(new MyRunnable(2));
    Thread thread3 = new Thread(new MyRunnable(3));
    Thread thread4 = new Thread(new MyRunnable(4));
    Thread thread5 = new Thread(new MyRunnable(5));

    thread1.start();
    thread2.start();
    thread3.start();
    Thread.sleep(10000);
    thread4.start();
    thread5.start();
  }
  //extends는 단일 상속이므로 runnable을 이용하여 implements를 활용하므로 다중상속이 가능하다.
  //이 또한 스레드이므로 순서에 상관없이 출력된다.(동시에 실행되는 것이므로)
}


