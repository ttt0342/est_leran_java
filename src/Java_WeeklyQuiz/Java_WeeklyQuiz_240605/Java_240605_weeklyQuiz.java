package Java_WeeklyQuiz.Java_WeeklyQuiz_240605;

import java.util.Scanner;

public class Java_240605_weeklyQuiz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("원하는 기능을 선택하세요.");
      System.out.println("1. 덧셈 /2. 뺼셈 /3. 곱셉 /4. 나눗셈 /0. 종료");
      int i = scanner.nextInt();
      if (i > 4) {
        System.out.println("올바른 입력이 아닙니다.");
      } else {
        if (i == 1) {
          System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
          int additionFirst = scanner.nextInt();
          System.out.println("두번쨰 값을 입력하고 엔터를 누르세요.");
          int additionSecond = scanner.nextInt();

          System.out.println(
              additionFirst + "+" + additionSecond + "=" + (additionFirst + additionSecond));
          continue;
        } else if (i == 2) {
          System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
          int subtractionFirst = scanner.nextInt();
          System.out.println("두번쨰 값을 입력하고 엔터를 누르세요.");
          int subtractionSecond = scanner.nextInt();

          System.out.println(
              subtractionFirst
                  + "-"
                  + subtractionSecond
                  + "="
                  + (subtractionFirst - subtractionSecond));
          continue;
        } else if (i == 3) {
          System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
          int multiplicationFirst = scanner.nextInt();
          System.out.println("두번쨰 값을 입력하고 엔터를 누르세요.");
          int multiplicationSecond = scanner.nextInt();

          System.out.println(
              multiplicationFirst
                  + "*"
                  + multiplicationSecond
                  + "="
                  + (multiplicationFirst * multiplicationSecond));
          continue;
        } else if (i == 4) {
          System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
          int divisionFirst = scanner.nextInt();
          System.out.println("두번쨰 값을 입력하고 엔터를 누르세요.");
          int divisionSecond = scanner.nextInt();

          System.out.println(
              divisionFirst + "/" + divisionSecond + "=" + (divisionFirst / divisionSecond));
          continue;
        } else if (i == 0) {
          System.out.println("종료됩니다.");
          break;
        }
      }
    } scanner.close();
  }
}
