package Java_240603;

public class Java_240603_3 {
  public static void main(String[] args) {
    //    int score = 95;
    //    char grade = (score > 90) ? 'A' : 'B'; // grade는 A로 문자열이 나옴
    //    char grade = (score > 90) ? 'A' : (score>85) ? 'B' : 'C';
    //      System.out.println("당신의 학점은" + grade);

    //      //score가 95점이고, 5의 배수이면 "good", 아니라면 "bad" 문자열을 나타내시오
    //      int score = 95;
    //      String grade = (score == 95 && score % 5 == 0) ? "good" : "bad";
    //      //문자열이므로 char가 아닌 String 사용하기
    //      //단순히 결과를 나눌 때 사용하기 좋음//
    //      //조건식이 많이 달린다면 if문을 사용해야 한다, 가독성을 위해서

    int score = 95;
    char grade;
    if (score > 90) {
      grade = 'A';
    } else {
      grade = 'B';
    }

    System.out.println("당신의 학점은 : " + grade);
  }
}
