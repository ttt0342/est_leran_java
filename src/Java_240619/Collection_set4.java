package Java_240619;

import java.util.HashSet;
import java.util.Set;

public class Collection_set4 {
    public static void main(String[] args) {
        Set<Collection_Map4_Member> set = new HashSet<>();

        set.add(new Collection_Map4_Member("홍길동", 30));
        set.add(new Collection_Map4_Member("홍길동", 30));
        //new키워드를 사용했으므로 서로 다른 인스턴스이다. 내부데이터가 같더라도
        //그래서 총 객체수는 2개

        System.out.println("총 객체수: " + set.size());
    }
    //오버라이딩 작성 후 객체 1개, 내부 데이터가 같다고 판단한다.
}

