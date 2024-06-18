package Java_240618;

public class Product<T, M> {
    private T kind;
    private M model;

    public T getKind() {
        return kind;
    }

    public M getModel() {
        return model;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public void setModel(M model) {
        this.model = model;
    }

    //게터, 세터 만들어주는 이유 : 외부에서 데이터에 직접적으로 접근하는 것을 막기 위해서
    //데이터의 무결성을 해칠 수 있기 때문이다.
}
