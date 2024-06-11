public class Java_240611_Person {

    //person이 가지고 있는 변수
    //상태, 변수, 데이터
    String name;
    int phoneNumber;
    int age;
    int money;

    //생성자 , 사람을 만들 때 필요한 내용, 클래스 이름과 같아야 한다. 생성자를 통해 객체를 생성함
    //상태를 만들어주는 것이 생성자
    public Java_240611_Person(String name, int phoneNumber, int age, int money){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.money = money;
    }



    //메서드는 기능담당
    //기능은 상태를 활용하여 만듦
//    public void sayHello() {
//        System.out.println("my name is " + name);
//    }
//
//    //person이라는 객에 sayMoney 기능을 추가함
//    public void sayMoney() {
//    System.out.println("내가 가지고 있는 돈은 " + money * 10000 + " 야!");
//    }

    //예
    //차를 객체화 하기 위해
    //차 이름, 바퀴, 핸들 등을 생성자를 통해 만들 수 있다.

    //메서드
    public void teaching(Java_240611_Student java240611Student){
        //파라미터로 student라는 객체(클래스)를 받음
        //티칭이 스튜던트 타입(클래스)이 필요함
        //teaching은 사용하지 않고 있어서 음영처리됨
        //student의 인스턴스 만들어주어 사용하기

        java240611Student.levelUp();
        //student 클래스에 레벨업 메서드를 만들어 주어야 함
    }

    public void cheating(Java_240611_Student java240611Student){
        java240611Student.levelDown();
    }
}
