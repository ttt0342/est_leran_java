package Java_240618;

public interface Storage<T> {
    //인터페이스도 제네릭 사용 가능, 타입 파라미터 1개
    void add(T item, int index);

    T get(int index);
    //get 메서드 인덱스를 통해서 T를 가져온다.

    //이를 구현하기 위해서 배열을 사용한다.
}
