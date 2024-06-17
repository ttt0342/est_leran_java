package Java_240614;

public class Java_240614_2 {
    public static void main(String[] args) {

        try {
            divide(10, 0);
        } catch (ArithmeticException e) { //연산자 활용 가능함
            System.out.println("0으로 나눌 수 없습니다.");
        }
    System.out.println("정상적으로 종료되었습니다.");
    }

    private static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
//throws가 없더라도 실행은 된다.
//명시적으로 작성해주는 것
//메서드 레벨에서 예외를 throw 한 것
//메서드 안에서도 쓰로우 가능
//복잡한 로직 내에서 예외가 존재할 수 있으므로 메서드 내에서도 예외처리가 가능하다.
//실무에서 예외상황이 많아

//public static void main(String[] args) {
//
//    try {
//        divide(10, 0);
//    } catch (ArithmeticException | NullPointerException | ) { //예외처리 여러개 잡을 수 있다.
//      //제일 상위의 Exception을 입력하면 모든 예외처리가 가능하다.
//      //그러나 실무에서 활용하지 않음, 예외는 어떤 예외인지 정확하게 알고 있어야 하는데
//      //Exception 사용하면 어떤 예외인지 정확하게 알 수가 없어 실무에서는 사용하지 않는다.
//      //아니면 캐치문을 여러개 작성한다. 이 방법이 보기에 한눈에 보인다.

//        System.out.println("0으로 나눌 수 없습니다.");
//    }
//    System.out.println("정상적으로 종료되었습니다.");
//}

//캐치문 여러개 작성
//public static void main(String[] args) {
//
//    try {
//        divide(10, 0);
//    } catch (ArithmeticException e) {
//        System.out.println("0으로 나눌 수 없습니다.");
//    } catch (NullPointerException ex) {
//        System.out.println("null입니다.");
//    }
//    System.out.println("정상적으로 종료되었습니다.");
//}
//
//private static int divide(int a, int b) {
//    if (a / b == 0) {
//        throw new ArithmeticException();
//    } else {
//        throw new NullPointerException();
//    }
//}
//
//private static int divide(int a, int b)  {
//    if(a/b == 0){
//        throw new ArithmeticException();
//    }else{
//        throw new NullPointerException();
//    }
//}



//직접 작성한 코드
//public static void main(String[] args){
//    try{
//        divide(10, 0);
//        //에러 발생하는 이유 메서드 만들어줘야 에러 발생 안함(알트 엔터)
//
//    } catch (ArithmeticException e) {
//        System.out.println("0으로 나눌 수 없습니다.");
//    }
//
//    private static int divide(int a, int b) throws ArithmeticException{
//        return a/b;
//    }
//}