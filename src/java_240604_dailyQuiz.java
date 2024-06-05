public class java_240604_dailyQuiz {
  public static void main(String[] args) {
    // 1번  whiile 안에 if문 넣는 것 지양하기
    //        int count = 1;
    //        while (true) {
    //            System.out.println(count);
    //            count++;
    //            if (count == 10000) {
    //                System.out.println(count);
    //                break;
    //            }
    //        }

    //        int count = 1;
    //        while (count <= 10000) {
    //            System.out.println(count);
    //            count++;
    //            }
    //        }

    //        //2번
    //        for (int i = 9; i >= 1; i--){
    //            for (int x = 9; x >= 1; x--){
    //                System.out.println(i + "*" + x + "=" + (i*x));
    //            }
    //        }
  }
}

// 3번 break, while 차이점
// break는 코드블록 탈출, 그러나 이중반복이라면 가까운 코드블록만 탈출
// continue는 현재 코드블록을 탈출한다. 그 외는 반복문 진행된다.