public class java_240604_dailyQuiz {
    public static void main(String[] args){
        //1번
//        int count = 1;
//        while (true) {
//            System.out.println(count);
//            count++;
//            if (count == 10000) {
//                System.out.println(count);
//                break;
//            }
//        }

        //2번
        for (int i = 9; i >= 1; i--){
            for (int x = 9; x >= 1; x--){
                System.out.println(i + "*" + x + "=" + (i*x));
            }
        }
    }
}
