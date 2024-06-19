package Java_240619;

import java.util.Objects;

public class Student {
  private int no;
  private String name;

  public Student(int no, String name) {
    this.no = no;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getNo() {
    return no;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student student)) return false;
    return getNo() == student.getNo() && Objects.equals(getName(), student.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNo(), getName());
  }
}
