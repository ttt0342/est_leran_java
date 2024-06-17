package Java_240617;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class Java_240617_5 {
    public static void main(String[] args){
//        ArrayList<String> stringArrayList = new ArrayList<>();
        //stringArrayList.add(1); //스트링만 넣을 수 있음
        //<> 안에 애니멀 넣으면 애니멀 타입만 넣을 수 있음
        //라이언은 애니멀에 포함되므로 넣을 수 있음

        //강한타입체크 - 타입을 명시하여 특정 타입만 넣을 수 있음 - 제약사항
        //원시타입은 <>안에 넣을 수 없음, 래퍼클래스로 변환하여 넣어야 한다.(inteeger 등으로 넣음)

        List list = new ArrayList<>();
        //String o =(String) list.get(0);
        //형변환 필요

//        List<Alnimal> alnimalList = new ArrayList<>();
//        alnimalList.add(new Lion());
//        //alnimalList.add(1);
//        //제네릭 사용 시 컴파일 중에 오류 찾을 수 있다.
//
//        //자바에서 모든 최상위 객체는 Object
//        //그러나 제네릭에 오브젝트를 넣으면 안된다.
//        //제네릭을 넣은 의미가 없어지므로 지양한다.
//        //인터페이스를 많이 넣거나, 타입 (스트링 등)을 넣어 활용한다.
//
//        List<String> alnimalList = new ArrayList<>();
//        String s = alnimalList.get(0);

    }
}
