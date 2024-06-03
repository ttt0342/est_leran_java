public class Java_340603_7 {
  public static void main(String[] args) {

    int data = 10;
    switch (data) {
      case 1:
        System.out.println("1입니다.");
        break; // 없으면 멈추지 않고 계속 실행된다.
      case 2:
        System.out.println("2입니다.");
        break;
      case 10:
        System.out.println("10입니다.");
        break; // 코드 중단하고 탈출할 수 있게 해줌
      default:
        System.out.println("맞는 숫자가 없습니다.");
    }

    // 예제:  프로그램 내에서 미리 지정된 요일에 따라 적합한 활동을 제안하는 프로그램을 작성하세요.
    // 1. 요일은 프로그램 내에서 문자열 변수로 미리 정의합니다 (예: "수요일").
    // 2. **`switch`** 문을 사용하여 각 요일에 따른 활동을 제안합니다.
    //    - 예: "월요일"에는 "책 읽기", "금요일"에는 "영화 보기" 등
    // 3. 일치하는 요일이 없으면 "알 수 없는 요일"이라는 메시지를 출력합니다.
    String day = "수요일";
    switch (day) {
      case "일요일":
        System.out.println("영화보기");
        break;
      case "월요일":
        System.out.println("드라마보기");
        break;
      case "화요일":
        System.out.println("보기");
        break;
      case "수요일":
        System.out.println("책보기");
        break;
      case "목요일":
        System.out.println("책보기");
        break;
      case "금요일":
        System.out.println("책보기");
        break;
      case "토요일":
        System.out.println("책보기");
        break;
      default:
        System.out.println("알 수 없는 요일");
    }

    // 문제1 : 변수 grade에 'A', 'B', 'C', 'D', 'F' 중 하나의 문자가 저장되어 있습니다. 각 등급에 따라 "Excellent", "Good",
    // "Average", "Below Average", "Fail"을 출력하는 코드를 작성하세요.
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
    }

    // 문제 2: 변수 operator에 '+', '-', '*', '/' 중 하나의 문자가 저장되어 있습니다. 두 개의 정수형 변수 num1과 num2의 값에 따라 해당
    // 연산을 수행하고 결과를 출력하는 코드를 작성하세요.
    int num1 = 10;
    int num2 = 20;
    char operator = '+';
    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
    }

    // 문제 3: 변수 color에 "red", "green", "blue" 중 하나의 문자열이 저장되어 있습니다. 각 색상에 따라 "Apple", "Grass",
    // "Sky"를 출력하는 코드를 작성하세요.

    String color = "red";
    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
    }

    // 문제 4: 변수 score에 0부터 100 사이의 점수가 저장되어 있습니다. 점수 범위에 따라 "A", "B", "C", "D", "F" 등급을 출력하는 코드를
    // 작성하세요.
    int score = 90;
    switch (score / 10) {  //몫을 구해서 기준을 나눔
      case 10, 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
        break;
    }

    // 문제 5: 변수 language에 "Java", "Python", "C++", "JavaScript" 중 하나의 문자열이 저장되어 있습니다. 각 프로그래밍 언어에 대한
    // 간단한 설명을 출력하는 코드를 작성하세요.

    String language = "Java";
    switch (language) {
      case "Java":
        System.out.println("Java 입니다.");
        break;
      case "Python":
        System.out.println("Python 입니다.");
        break;
      case "C++":
        System.out.println("C++ 입니다.");
        break;
      case "JavaScript":
        System.out.println("JavaScript 입니다.");
        break;
    }
  }
}
