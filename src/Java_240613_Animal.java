public class Java_240613_Animal {
    String name;
    //알트 인서트
    String gender;

    public void setName(String name) {
        this.name = name;
    }

    public Java_240613_Animal(String name,String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void sleep() {
    System.out.println(this.name + "Zzz...");
  }
}

//생성자가 없다면 컴파일러에서 자동으로 만들어 준다.



