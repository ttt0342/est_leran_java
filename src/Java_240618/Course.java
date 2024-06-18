package Java_240618;

public class Course<T> {
    private String name;    //강의 과정(course)은 강의명, 학생들
    private T[] students;

    public Course(String name, int capacity) {
      this.name = name;
      students = (T[]) (new Object[capacity]);
      // 타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열을 생성할 수 없고
      // (T[]) (new Object[n])으로 생성해야한다.

      // 타입 파라미터로 배열을 생성하려면 반드시 (T[]) (new Object[n]) 형태로 생성해야 한다.(형태 고정)
    }

    public String getName() {
      return this.name;
    }

    public T[] getStuedents() {
      return this.students;
    }

    //배열에 비어있는 부분을 찾아서 수강생을 추가하는 메서드
    public void add(T t) {
      for (int i = 0; i < students.length; i++) {
        if (students[i] == null) {
          students[i] = t;
          break;
        }
      }
    }

}
