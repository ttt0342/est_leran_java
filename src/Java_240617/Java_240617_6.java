package Java_240617;

public class Java_240617_6 {
    public static void main(String[] args){
        Java_240617_Box<String> stringbox = new Java_240617_Box<>();
        Java_240617_Box<Integer> integerJava240617Box = new Java_240617_Box<>();
        //타입변환 최소화 -> 유연한 설계까 가능함

        stringbox.set("d");
        integerJava240617Box.set(6); //박싱
        int i = integerJava240617Box.get(); //언박싱

    // 박싱 = int -> integer
    // 언박싱 = integer -> int

    System.out.println(stringbox.isIns());
  }
}
