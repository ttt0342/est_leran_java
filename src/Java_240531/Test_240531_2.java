package Java_240531;

public class Test_240531_2 {
  public static void main(String[] args) {
//100개의 원소를 가진 정수배열 arr를 만드시오
    int[] arr = new int[100];       //배열 선언을 함과 동시에 초기화
    String[] arr2 = new String[1000]; // null이 나옴 결과값이 없기 때문에
    System.out.println(arr);  //참조 타입이므로 주소 나옴
    System.out.println(arr[0]); // 배열이 0값으로 초기화 되어 0으로 나옴
  }
}
