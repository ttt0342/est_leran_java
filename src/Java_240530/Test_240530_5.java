package Java_240530;

public class Test_240530_5 {
  public static void main(String[] args) {
      //실행기, 내부의 코드를 실행시킬 수 있음, 하나만 존재해야함
//    int a = 1;
//    int v = a;
//    System.out.println(a);
//    System.out.println(v);    //값이 복사됨

//      char c1 = 'A';
//      char c2 = 65;
//      char c3 = '\u0041';
//      char c4 = '가';
//      char c5 = 44032;
//      char c6 = '\uac00';
//
//      int uniCode = c1;
//
//    System.out.println(c1);
//    System.out.println(c2);
//    System.out.println(c3);
//    System.out.println(c4);
//    System.out.println(c5);
//    System.out.println(c6);
//    System.out.println(uniCode);

      short sVal = 10;
      short result = (short) (sVal + 10);
      //int를 short로 형변환 sVAL+10은 int 값이므로 강제로 short로 형변환시킴
    System.out.println(result);
    }
}
