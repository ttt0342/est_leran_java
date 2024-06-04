public class Java_240604_review {

  public static void main(String[] args) {
    int i = 0; // 초기화식

    while (i < 10) {
      if (i == 5) {
        i++; // 증감식
        continue;
      }
      System.out.println(i);
      // i++; // 증감식
    }
  }
}
