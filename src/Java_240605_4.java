import java.util.*;

public class Java_240605_4 {
  public static void main(String[] args) {
    Random random = new Random(); // 알트 엔터로 지역변수 삽입하는 방법을 사용하기,랜덤에 접근할 수 있는 주소를 갖고 있다.

    //    int i = random.nextInt();  //값을 지정하면 양수로 나오며 그 범위 안의 숫자로 나온다.
    //    int i = random.nextInt(6)+1; //나온 값에 +1 해줌 그래서 1부터 6까지
    //    double i = random.nextGaussian(); //가우스 함수
    //    boolean i = random.nextBoolean(); //true, false 무작위
    //
    //    System.out.println(i);  //int의 범위 안에서 랜덤한 값을 반환한다. 예)로또

    // 로또 번호 생성기
    // 로또 번호 생성기 프로그램을 작성하세요. 이 프로그램은 1부터 45까지의 숫자 중 중복되지 않는 6개의 숫자를 무작위로 선택하여 출력합니다.

    //    Scanner scanner = new Scanner(System.in);
    //    Random random = new Random();
    //    ArrayList<Integer> lotto = new ArrayList();
    //    int[] lotto = new int[6];
    //    for (int i = 0; i < lotto.length; i++) {
    //      int sum = random.nextInt(45) + 1;
    //      System.out.println("로또 번호 : " + sum);
    // int[] arr = nwe int[5];  //배열은 크기가 고정됨

    ArrayList<Integer> list = new ArrayList<Integer>();
    // 배열 안에 정수형만 들어갈 수 있도록 고정하는 것 즉 정수형리스트, 리스트는 추가, 삭제가 가능함, 개발에서 리스트 더 많이 쓰임, 유지보수가 가능하므로
    // <> 안에 있는 것은 타입, <> 안에는 클래스만 넣을 수 있다. int는 예약어이고, integer는 클래스 타입(wrapper)
    // 즉, int를 integer 클래스로 변환하는 것을 박싱
    // boolean -> Boolean(박싱), double -> Double 기본타입들을 클래스로 사용하기 위해 래퍼클래스가 존재한다
    // 언박싱 - 래퍼 클래스를 기본 타입으로 변환
    // 로또 번호를 리스트에 넣기 위해 작성한 코드

    while (list.size() != 6) { // 리스트가 가지고 있는 크기가 6보다 작을 동안 사이즈: 리스트 내부 요소의 개수 6개를 뽑아내기 위해
      int number = random.nextInt(45) + 1;
      if (!list.contains(number)) { // 내가 뽑은 랜덤한 값이 리스트에 없다면(중복 없앰)
        list.add(number); // 추가한다. 리스트 안에 6개의 중복없는 정수를 담음, 사이즈가 6이 될 때까지 (안티코드)
      }
    }
    for (int data : list) {
      System.out.println("로또 번호 = " + data);
    }

    // 리스트를 만든 이유는 로또 번호 6개를 담기 위해서
    // 이 배열 안에 숫자가 6개가 될 동안 while문 실행, 사이즈가 6이 될 동안 랜덤한 값을 뽑는다.
    // if문에서 랜덤한 값을 뽑아냈을 때 리스트에 없다면 추가, 있다면 다시 뽑기
    // 6개가 되면 탈출



    // set 이용해서 로또번호 만들기
    Set<Integer> set = new HashSet<>();

    while (set.size() != 6) {
      int number = random.nextInt(45) + 1;
      set.add(number);
    }
  }
}
