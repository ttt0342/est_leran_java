package Java_240611;

public class Java_240611_Test3 {

  public static void main(String[] args) {
    Java_240611_Person java240611Person1 = new Java_240611_Person("김성연", 01010101010, 20, 10000);
//    person1.sayHello();
//    // person이라는 추상화된 클래스는 애초에 만들어질때 이름이 다르게 설정됨
//    // 타입으로 봤을 때는 같은 person인 것은 맞음
//    // 이를 생성할 때 값을 따로 넣을 수 있는 것이 생성자
//    // 생성자는 클래스 이름과 같아야 한다.
//    Person person2 = new Person("맥스", 01000000000, 20, 10000);
//    person2.sayHello();
//    Person person3 = new Person("맥스", 01000000000, 20, 10000);
//    person3.sayMoney();
//    Person person4 = new Person("맥스", 01000000000, 20, 10000);
//    person4.sayMoney();

    // 각각 다른 사람을 추상화한 것
    // person1, person2의 메모리 값이 다르다.
    // 단, 추상화의 관점에서 같은 사람을 표현한 것이다.

    // 생성 시, person으로 만들어야 함

    //생성자로 인스턴스를 만듦
    Java_240611_Student java240611Student = new Java_240611_Student();
    //person이 티칭을 해야 스튜던트가 레벨업을 할 수 있다고 이해
    //그래서 스튜던트가 티칭을 하면 레벨업
    //치팅을 하면 레벨 다움

    java240611Person1.teaching(java240611Student); //아규먼트로 student 전달, 현재 레벨 1로 초괴화
    java240611Person1.cheating(java240611Student);

  }
}
//티칭을 호출했을 때, 스튜던트를 만들고 넣은 순간 레벨업을 호출하고, 레벨업이 실행되어 처음 레벨의 값은 1이며,
//레벨이 1 증가 하여 출력하면 결국 레벨은 2로 출력된다.

//흐름 이해하기

//객체지향
//객체 간 얽혀 진행된다.
//person과 student는 다른 객체이므로 다름 클래스를 사용하여 만든다.




