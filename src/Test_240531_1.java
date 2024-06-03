import java.util.Locale;

public class Test_240531_1 {
  public static void main(String[] args) {

    //    int a = 10;
    //
    //
//        String firstName = "seongyeon";
//        String secondname = "Kim";
//        String phone = "Iphone";
//        String status = "good";
//        System.out.println("나는" + secondname + " " + firstName + "입니다.");
//        System.out.println(phone + "is" + status);
//
//        System.out.println(firstName.length()); //길이나타냄
//        System.out.println(firstName.toUpperCase()); //대문자로 변환
//        System.out.println(firstName.equals(secondname)); //문자열 비교
//
//        String a = "hello";
//        String b = new String("hello");
//
//        System.out.println(a.equals(b));  // true
//        System.out.println(a == b);  // false

    //    String a = "Hello World!";
    //    System.out.println(a.indexOf("e"));   //값이 -0 나옴 = 찾을 수 없다는 뜻
    //    // 같은 단어라면 맨 처음의 인덱스 값 반환
    //    System.out.println(a.contains("World"));
    //
    //    //ESTSOFT 를 b라는 함수에 담고 SOFT가 포함되어 있는지 코드를 작성하세요
    //
    //    String b = "ESTSOFT";
    //    System.out.println(b.contains("SOFT")); //boolean 값을 나타내고 있어 트루, 폴스 나타냄

     //charAt을 활용해서 hobby 만들어보기
        String findChar = "What is your hobby";
        System.out.println(findChar.charAt(13) +""+ findChar.charAt(14) + findChar.charAt(15) +
     findChar.charAt(16) + findChar.charAt(17));    //인덱스 값은 0부터이므로 i

//        //문자열 변경
//        String a = "Hello World! Hello World! Hello World! Hello World!";
//        System.out.println(a.replaceAll("World", "Java"));
//        //All이 붙어있어 해당하는 것을 전부다 바꿈, 안붙어있어도 다 바꿈, First는 처음 찾은 것만 바뀜
//        //정규표현식 리플레이스 올, 아니라면 리플레이스(텍스트)

//        String a = "WEEEE ASKE ;ND";
//        System.out.println(a.substring(0,5)); //시작위치는 맞으나 내가 원하는 값의 끝위치 +0
//        System.out.println(a.substring(0,3) + a.substring(8,10)+ a.substring(12,14));
//        System.out.println(a.substring(0,a.length())); //length

//        String a = "a:b:c:d";   //한 문자열
//
//        String[] result = a.split(":");// 콜론 기준으로 자르면 독립적인 문자가 되므로 배열로 바꿔 넣는것
//        System.out.println(result);

//        String result = "Hello";
//        System.out.println(result.concat("!"));   // 결과 : Hello!

//        String result = "Hello";
//        result = result + "!";
//        String concat = result.concat("!");    //위 두줄이 같음
//        System.out.println(result+"!");
//        System.out.println("=====================");
//        System.out.println(result.concat("!"));

    //    String name1 = "Tim";
    //    int age1 = 30;
    //    String name2 = "Anna";
    //    int age2 = 45;
    //
    //    String format = String.format("%s의 나이는 %s세 입니다.", name1, age1);
    //    //알트 엔더 지역변수 삽입, 지역변수 삽입하면 값을 변수 안에 넣어 선언한다. 지역변수 그 범위 내에서 일어나는 것이다. 전역변수 전체 영역에서 일어나는 것
    // 지역변수간 간섭 없음, 아무런 범위에 속하지 않는다면 전체 영역에 영향을 미칠 수 있다.
    //    String format1 = String.format("%s의 나이는 %s세 입니다.", name2, age2);
    //    // 골격이 정해지고 데이터만 핸들링함 갯수 제한 없으나 너무 많아지면 가독성 떨어진 최대 3개,
    //    System.out.println(format);
    //    System.out.println(format1);

    String result = ""; // 빈 문자열은 true 값이 들어있지 않을 뿐
    result += "Hello ";
    result += "Java";
    result += "World";
    System.out.println(result);

    StringBuilder sb = new StringBuilder();
    sb.append("Hello ");
    sb.append("Java");
    sb.append("World");
    System.out.println(sb); // .toString 추가 해야하는 경우도 있음
    // 간단한 문자열은 스트링, 뭔가 문자열을 붙여야 할때는 스트링 빌더, 버퍼를 무조건 사용한다.

    StringBuffer sf = new StringBuffer(); //빌더 버퍼는 똑같은 역할을 한다.
    sf.append("Hello ");
    sf.append("Java");
    sf.append("World");
    System.out.println(sf);
    StringBuffer sf2 = new StringBuffer();
    sb.append("Hello");
    sb.insert(0, "World");  //인덱스 번호 순서에 끼어 들어가는 것 원래 있던 것 뒤로 밂
    sb.insert(0, "World");
    sb.insert(0, "World");
    sb.insert(0, "World");
    System.out.println(sb);

  }
}
