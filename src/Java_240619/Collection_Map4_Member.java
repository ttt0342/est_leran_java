package Java_240619;

public class Collection_Map4_Member {
  String name;
  int age;

  public Collection_Map4_Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override // 객체의 동등비교에 사용한다. 오버라이드
  public boolean equals(Object o) {
    if(o instanceof Collection_Map4_Member){
        //오브젝트가 멤버로 형변환이 될 수 있는지 물어본다. 오브젝트를 멤버로 형변환이 가능하다.
        Collection_Map4_Member collectionMap4Member = (Collection_Map4_Member) o; //오브젝트를 멤버로 형변환한다.
        return collectionMap4Member.name.equals(this.name) && collectionMap4Member.age == this.age;
        //내부데이터가 같은지 검증한다.
        //this(현재객체 - 본인를 가리킨다.)의 name과 들어온 객체의 name을 비교한다. - 다르면 false 반환
        //age도 두 객체의 정수를 비교한다. 같으면 true, 다르면 false 반환
        //해시코드를 만들어 이퀄즈 내에서 해시코드 동등판단하여 비교한다.

    }else {
        return false;  //멤버형으로 변환될 수 없을 때 false, set에 저장된다.
    }
  }

  @Override
  public int hashCode() {
    int i = name.hashCode() + age; //나이가 바뀌면 값이 달라져 객체도 2개가 된다.
    System.out.println(i);  //해시코드가 그 객체 특정값을 추출해준다.
    return i;
    //return name.hashCode() + age;  //스트링 값을 기준으로 해시코드를 만든다. + age값 더하기
    // 자체가 해시코드가 된다.
  }
}
