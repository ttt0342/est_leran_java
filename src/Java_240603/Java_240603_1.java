package Java_240603;

public class Java_240603_1 {
  public static void main(String[] args) {
//        int number1 = 10;
//        int number2 = 3;
//
//        int sum = number1 + number2; // 13
//        int diff1 = number1 - number2; // 7
//        int diff2 = number2 - number1; // -7
//
//        int product = number1 * number2;
//        int qout = number1 / number2;
//        int remainder = number1 % number2;
//
//        System.out.println("덧셈" + sum);
//        System.out.println("뺄셈1" + diff1);
//        System.out.println("뺼셈2" + diff2);
//        System.out.println("곱셈" + product);
//        System.out.println("나눗셈" + qout);
//        System.out.println("나머지" + remainder);

//        byte a = 1;
//        byte b = 1;
//        byte c = a + b;
//        //해결방법
//        int c = a + b;
//        int c =(int) a + b;  //강타입 언어이므로 타입을 정확하게 정해야 한다.

//        int a = 10;
//        int b = 4;
//        int c = a/b; //2  정수이므로 2.5 아닌 2 나오게 됨
//        double d = a/b;  //2로 먼저 정수화를 하고 이후에 2.0이 나오게 됨
//
//        //2.5를 결과물로 얻기 위해서는
//        double d = (double) a/b;

    //    char c1 = 'A' + 1;  //A 유니코드 65번
    //    char c2 = 'A';
    //    char c3 = (char)c2 + 1;   //에러나는 이유 필요한 값이 char인데 int가 되어버림
    //    //char이 정수형 데이터라서 int로 표현
    //    String  str1 = "안녕하세요";
    //    String  str2 = "반갑습니다";
    //    String  str3 = str1 + str2;
    //    System.out.println(str3);

    //    // 문자열 "Hello"와 123이 먼저 연산되어 "Hello123"이 되고,
    //// 이것을 다시 456과 연산하여 "Hello123456"이 됩니다.
    //    System.out.println("Hello" + 123 + 456);  // Hello123456
    //
    //// 숫자 123과 456이 먼저 연산되어 579가 되고,
    //// 이것을 문자열 "Hello"와 연산하여 "579Hello"가 됩니다.
    //    System.out.println(123 + 456 + "Hello");  // 579Hello  왼쪽부터 하나씩 더해나감
    //  //문자열이 먼저 더해지면 값을 문자열로 인식하여 옆에 붙어지기만 함, 숫자가 먼저 더해지면 숫자로 인식하다가 문자열이 옆에 붙게 됨

    //    StringBuilder sb = new StringBuilder();
    //    sb.append(123);
    //    sb.append(456);
    //    sb.append("Hello");
    //    System.out.println(sb);   //String은 문자연산 시 새로운 값을 나타내므로 컴퓨터 자원을 낭비함

    int number1 = 10;
    int number2 = 30;

    System.out.println(number1 > number2);
    System.out.println(number1 < number2);
    System.out.println(number1 >= number2);
    System.out.println(number1 <= number2);

    System.out.println(number1==number2);
    System.out.println(number1!=number2);  //이는 기본연산임

    String a = new String();    //참조타입은 주소값을 가지므로 객체가 같더라도 ==으로 하면 다름
    //equels를 사용해야 문자열 자체를 판단할 수 있다.
    String b = new String();

    System.out.println(a==b); //false
    System.out.println(a.equals(b)); //true

    System.out.println('A'<'B'); //유니코드로 변경되어 계산된다.

    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");  //참조 타입이므로 주소값이 다름

    System.out.println(str1 == str2);  // true
    System.out.println(str1 == str3);  // false

  }
}
