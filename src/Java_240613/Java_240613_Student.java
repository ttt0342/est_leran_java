package Java_240613;

public class Java_240613_Student extends Java_240613_Person {
  int studentNo;

  public Java_240613_Student(String name, String ssn, int studentNo) {
    super(name, ssn); // 부모의 생성자가 있으므로 먼저 만들어주고
    this.studentNo = studentNo;
  }

//  public void say(String name) {
//    System.out.println("my name is " + name);
//  }


}
