package Java_240604;

public class Java_240604_1 {
  public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5) { // i가 5보다 작을동안  i가 6일 될 때 탈출
//          System.out.println("현재 i의 값은 " + i); // 계속 반복
//          i++; } // 5번 실행된다. 6이 됐을 때 탈출
//
//10부터 0에 도달할 때까지 카운트다운을 출력하는 프로그램을 작성하세요.
//   //  **조건**:
//   //  1. 시작 숫자는 10입니다.
//   //  2. **`while`** 문을 사용하여, 현재 숫자에서 1씩 감소시키면서 카운트다운을 진행합니다.
//   //  3. 카운트다운은 0에 도달할 때까지 계속됩니다.
//   //  4. 각 숫자는 새로운 줄에 출력되어야 합니다.
//        int x = 10;
//        while (x >= 0) {
//          System.out.println("현재 카운트 :" + x);
//          x--;
//        }
//        System.out.println("카운트 종료");
//
//        // 1부터 주어진 양의 정수 n까지의 합을 계산하여 출력하는 코드를 while문을 사용하여 작성하세요.
//        // 주어진 값: n = 100
//        int n = 1;
//        int sum = 0;
//        while (n <= 100) {
//          sum += n;
//          n++;
//        }
//        System.out.println(sum);
//
//        int sum = IntStream.rangeClosed(1, 100).sum();
//
//        System.out.println(sum); //참고하기 , 위의 while문이 너무 길면 사용
//
//    // - 주어진 배열 numbers에 저장된 숫자들의 평균을 계산하여 출력하는 코드를 while문을 사용하여 작성하세요.
//    //    - 주어진 배열: numbers = [5, 2, 9, 1, 7, 4, 6, 3, 8]
////        int [] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
//        int i = 0;  //인덱스 번호
//        int sum = 0;  //배열의 합
//        while (i<numbers.length){
//          sum += numbers[i];  //인덱스 번호를 통해 뽑아낸 값의 합
//          i++;
//        }
//        System.out.println(sum/numbers.length);
//
//    // 0부터 300까지 3의 배수만 출력하기
//        int i = 0;
//        while (i <= 300) { // 참일동안 = 무조건 참이므로 무한루프
//          if (i % 3 == 0) { // 3의 배수만 나오게 하고 싶다면 if문 사용하기
//            System.out.println(i); // 이 코드만 있으면 0만 나옴
//          }
//          i++;
//        }
//
//    // 주어진 배열에서 가장 큰 값을 찾아 출력하는 프로그램을 작성하세요.
//        int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
//        int max = numbers[0];
//        int i = 1; // 이미 max에서 0을 사용하였으므로 1번 인덱스부터 비교하기
//
//        while (i < numbers.length) {
//          if (numbers[i] > max) {
//            max = numbers[i];
//          }
//          i++;
//        }
//        System.out.println(max);
//
//        public static void main(String[] args) {    예시
//          int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
//
//          int max = numbers[0];
//          int i = 1;
//          while(i<numbers.length){
//            if (numbers[i] > max) {
//              max = numbers[i];
//            }
//            i++;
//          }
//          System.out.println(max);
//        }
//
//    // 주어진 배열에서 양수의 합과 음수의 합을 각각 구하여 출력하는 프로그램을 작성하세요.
//        int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
//        int i = 0;
//        int positiveSum = 0;
//        int negativeSum = 0;
//        while (i < numbers.length){
//          if(numbers[i]>0){
//            positiveSum += numbers[i];
//          }else {
//            negativeSum += numbers[i];
//          }
//          i++;
//        }
//        System.out.println("양수 합" + positiveSum);
//        System.out.println("음수 합" + negativeSum);
//
//     //코드가 길 경우 실무에서 작성하는 방법  참고
//        int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
//        int posNum = IntStream.of(numbers).filter(num -> num > 0).sum();
//        int neNum = IntStream.of(numbers).filter(num -> num < 0).sum();
//
//        public static void main(String[] args) {   예시
//          int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
//          int positiveSum = 0;
//          int negativeSum = 0;
//          int i = 0;
//          while (i < numbers.length) {
//            if (numbers[i] > 0) {
//              positiveSum += numbers[i];
//            } else {
//              negativeSum += numbers[i];
//            }
//            i++;
//          }
//          System.out.println(positiveSum);
//          System.out.println(negativeSum);
//        }
  }
}

