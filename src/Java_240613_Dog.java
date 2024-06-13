public class Java_240613_Dog extends Java_240613_Animal{

    void sleep(int times){
    System.out.println(name + "Zzz..." + times + "hours");
    }

    void sleep(int times, int a){
        System.out.println(name + "Zzz..." + times + "hours");
    }  //매개변수가 다르면 다른 함수로 인식한다. - 오버로딩

    public Java_240613_Dog(int age){
        super("okay", "남");   //super에 애니멀, 기본값,
        //new animal();
        //이를 통해 힙영역 위에 올라감 -> 이제 도그에서 상속받을 수 있게 된다.
        //(도그에서 생성자가 선언되지 않았을 경우)
        //애니멀도 클래스 이므로 힙영역에 만들어진다.
        //그러나 애니멀은 new를 통해 만들지 않음
        //그래서 자바에서 자동적으로 만들어준다.
        //super= 해당 클래스의 상위클래스

        //this.age = age;
        //super가 순서상으로 먼저 올라와야 하므로 수퍼가 밑에 있다면 오류발생한다.
        //
    }
}
