package Java_240604;

public class Java_240604_3 {
  public static void main(String[] args) {
    // 이중 반복문

    //    for (int i = 0; i < 10; i++) {
    //      System.out.println(i);
    //    }
    //
//    int i = 0; // int i; for문 안에서 int i = 0;
//    for (; i < 10; i++) { // for문이 실행이 될 때는 메모리에서 i를 가지고 있다가 for문 실행 끝나면 i는 메모리에서 사라짐  ==
//      //     메모리를 효율적으로 사용하기 위함,  i를 살리기 위해서 밖에서 선언 해주어야 한다.
//      System.out.println(i);
//    }
//    System.out.println(i); // 연산 후의 최종 값은 for문 밖에 입력한다.

    // 구구단 2단부터 출력하기
    //    for (int i = 1; i <= 9; i++) {
    //      System.out.println("2*"+i+"="+(2*i));
    //    }

    //   // 구구단 1단-9단 출력하기
    //        for (int i = 1; i <= 9; i++){
    //          for (int x = 1; x <= 9; x++){
    //            System.out.println(i + "*" + x + "=" + (i*x));
    //          }
    //        }

    //    //19단부터 역방향으로 내려오도록 만들기
    //    for(int i = 19; i >= 1; i--){
    //      for(int j = 9; j >=1 ; j--) {
    //        System.out.println(i + "X" + j + "=" + i*j);
    //      }
    //    }

    // break, continue
//        int number = 0;
//        while (number < 10) {
//          System.out.println("현재 숫자는 " + number);
//          if (number == 5) {
//            System.out.println("5가 되었습니다.");
//            break;  //반복문을 탈출 그래서 while문 탈출함
//          }
//          number++;
//        }

//        for(int i = 0; i < 10; i++){
//          System.out.println("현재숫자"+i);
//          if (i=5){
//            break;  //for문 탈출함
//          }
//        }

//        for (int i = 0; i < 10; i++) {
//          System.out.println("현재 i의 값은 = " + i);
//          for (int j = 0; j < 10; j++) {
//            System.out.println("현재 j의 값은 = " + j);
//            if(j == 5){
//              break;  //j만 바깥으로 나가게 된다. break는 가장 가까운 반복문을 탈출한다.
//            }
//          }
//        }

    // 이중포문을 만든다. i는 1부터 100까지 j는 2부터 100까지
    // 단, 조건은 i는 50이 되면 브레이크, j는 80이 되면 브레이크
    //    for (int i = 1; i <= 100; i++) {
    //      System.out.println("현재 i 값 = " + i);
    //      if (i == 50) {
    //        break;
    //      }
    //      for (int j = 2; j <= 100; j++) {
    //        System.out.println("현재 j 값 = " + j);
    //        if (j == 80) {
    //          break;
    //        }
    //      }
    //    }

    // continue
//        int number = 0;
//
//        while (number < 10) {
//          number++; // 1부터 출력되는 이유는 먼저 number에 1을 더해주기때문이다.
//          if (number == 3) {
//            continue; // 3만 뺴고 출력된다.
//          } else {
//            System.out.println("현재 값은 : " + number);
//          }
//        }

    //    for (int i = 0; i < 10; i++) {
    //      if (i == 3) {
    //        continue;
    //      }
    //      System.out.println("현재 값은 : " + i); // 굳이 else를 넣을 필요가 없음
    //    }
    // 이중 for문에도 continue 사용할 수 있음

//        for (int i = 0; i < 10; i++) {
//          if (i == 5) {
//            break;
//          }
//          for (int j = 0; j < 10; j++) {
//            if (j == 5) {
//              continue;
//            }
//            System.out.println(j);
//          }
//        }

    //    // 1부터 10까지 숫자를 출력하세요. 이때 4와 7은 건너뛰고 출력하세요 (손풀기 단계)
    //    for (int i = 1; i <= 10; i++) {
    //      if (i == 4 || i == 7) {  //4와 7은 OR을 활용
    //        continue;
    //      }
    //      System.out.println(i);
    //    }

    //    //향상된 반복문(for문)
//        int[] arr = {1,2,3,4,5};
//        for(int i = 0; i<arr.length; i++)
//      //=>
//        for(int i:arr){ // ':' 사용함, 가독성이 좋아짐
//          System.out.println(i);
//        }
//
//    // 퀴즈 1: 정수형 배열 scores가 주어졌을 때, 향상된 반복문을 사용하여 점수의 총합과 평균을 계산하는 코드를 작성하세요.
//    int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
//    int sum = 0;
//    for (int a : scores) {
//      sum += a;
//    }
//    System.out.println("총합 = " + sum);
//    System.out.println("평균 = " + sum / scores.length);

    // 퀴즈 2: 문자열 배열 names가 주어졌을 때, 향상된 반복문을 사용하여 이름의 길이가 5 이상인 이름만 출력하는 코드를 작성하세요.
    String[] names = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
    for (String a : names) {
      if (a.length() >= 5) {
        System.out.println(a);
      }
    }
  }
}
