package Java_240604;

public class Java_240604_2 {
  public static void main(String[] args) {
    //    for (int i = 1; i <= 5; i++) { // i를 1로 초기화하고 i가 5보다 작거나 같으면 for문 실행됨
    //      System.out.println(
    //          "현재 i의 값은=" + i); // 초기식 -> 조건식 -> 증감식 -> 조건식 -> 증감식 ... //증감식 수행 후 조건식 false 일 때
    // 코드블록 탈출
    //    }
    //    for (int i = 1; i < 5; i++) { // i가 4까지 true, 조건식이 중요함
    //      System.out.println("현재 i의 값은=" + i);
    //    }
    // 1부터 100까지의 숫자 중에서 모든 짝수의 합을 계산하고 출력하는 프로그램을 작성하세요.
    //    int sum = 0;
    //    for (int i = 1; i <= 100; i++) {
    //      if (i % 2 == 0) {
    //        sum += i;
    //      }
    //    }
    //    System.out.println("짝수 합" + sum);

    // 문제: 사용자로부터 정수 n을 입력받아, 1부터 n까지의 정수 중에서 3의 배수이면서 5의 배수인 수의 합을 계산하여 출력하는 프로그램을 작성하세요.
    // 예시:
    // 입력: 20
    // 출력:15
    // 설명:
    // 1부터 20까지의 정수 중에서 3의 배수이면서 5의 배수인 수는 15 하나뿐입니다. 따라서 출력 결과는 15의 합인 30입니다.
    // 이 문제에서는 for문을 사용하여 1부터 n까지의 정수를 순회하면서, 3의 배수이면서 5의 배수인 수를 찾아 그 합을 계산해야 합니다.
    //    int num = 20;
    //    int sum = 0;
    //    for (int i = 1; i <= num; i++) {
    //      if (i % 3 == 0 && i % 5 == 0) {
    //        sum += i;
    //      }
    //    }
    //    System.out.println(sum); // 15

    // 피보나치 수열의 첫 10개 항을 출력하는 프로그램을 작성하세요.
    // 설명:
    // 피보나치 수열은 다음과 같이 정의됩니다:
    // - 첫 번째 항과 두 번째 항은 1입니다.
    // - 세 번째 항부터는 이전 두 항의 합으로 정의됩니다.
    // 피보나치 수열의 첫 10개 항은 다음과 같습니다:
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    // 이 문제에서는 for문을 사용하여 피보나치 수열의 첫 10개 항을 차례로 출력해야 합니다.
    // 힌트:
    // - 첫 번째 항과 두 번째 항을 변수에 초기화합니다.
    // - for문을 사용하여 10번 반복합니다.
    // - 각 반복에서 이전 두 항의 합을 계산하여 다음 항을 구합니다.
    // - 현재 항을 출력합니다.

    //    int a = 1;
    //    int b = 1;
    //    int c = 0;
    //    for (int i = 3; i <= 10; i++) {
    //      c = a + b;
    //      a += c;
    //    }
    //    System.out.println(b);

    //    int[] arr = new int[6];
    //    arr[0] = 1;
    //    arr[1] = 1;
    //    for (int n = 2; n <= arr.length; n++) {
    //      arr[n] = arr[n - 2] + arr[n - 1];
    //    }
    //    for (int i : arr) {
    //      System.out.println(i); // 1 1 2 3 5 8 수열 출력
    //    }
    //
    //    // 100부터 1까지 찍기
    //    for (int i = 100; i >= 1; i--) {
    //      System.out.println(i);
    //    }

    //    // 0부터 -100까지 하향식으로 for문을 돌리는데 짝수만 출력하기
    //    for (int i = 0; i >= -100; i--)  //부등호 방향 확인하기
    //      if (i % 2 == 0) {
    //        System.out.println(i);
    //      }

    // 100까지의 배열 공간 arr에서 피보나치 배열 만들기
//    int[] arr = new int[100];
//    arr[0] = 1;
//    arr[1] = 1;
//
//    for (int n = 2; n <= arr.length; n++) {
//      arr[n] = arr[n - 2] + arr[n - 2];
//    }
//    for (int i : arr) {
//      System.out.println(i);
//    }
    //Arrays.parallelSetAll(arr,i->(i<2)?1:arr[i-1]+ arr[i-2]);
  }
}
