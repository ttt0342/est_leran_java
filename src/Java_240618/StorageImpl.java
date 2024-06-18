package Java_240618;

public class StorageImpl<T> implements Storage<T>{
    private T[] array;

    public StorageImpl(int capacity){  //내가 설정한 배열의 크기
        this.array = (T[]) (new Object[capacity]);
    }

    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
