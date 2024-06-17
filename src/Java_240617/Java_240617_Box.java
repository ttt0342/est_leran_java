package Java_240617;

public class Java_240617_Box<T> {
  // <> 안에 타입을 넣으면 밑의 코드에도 동일한 타입을 입력해야 한다.
  private T t;

  public void set(T t) {
    this.t = t;
  }

  public T get(){
    return t;
  }
  // 오브젝트 사용하여 모든 타입의 객체를 넣을 수 있다.

  public boolean isIns() {
    return t instanceof String;
  }

//  public <T> Box<T> boxing(T t) {
//
//  }

}
