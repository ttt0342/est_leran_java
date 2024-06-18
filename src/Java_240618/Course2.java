package Java_240618;

import java.util.Arrays;

public class Course2 {
  public static void main(String[] args) {
    Course<Person> personCourse = new Course<>("일반인",5);
    personCourse.add(new Person("일반인"));
    personCourse.add(new Worker("직장인"));
    personCourse.add(new Student("학생"));
    personCourse.add(new HighStudent("고등학생"));

    Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
    workerCourse.add(new Worker("직장인"));

    Course<Student> studentCourse = new Course<>("학생과정", 5);
    studentCourse.add(new Student("학생"));
    studentCourse.add(new HighStudent("학생"));

    Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
    highStudentCourse.add(new HighStudent("고등학생"));



    registerCourse(personCourse);
    registerCourse(workerCourse);
    registerCourse(studentCourse);
    registerCourse(highStudentCourse);  //4번 호출

    System.out.println("=================");
    System.out.println("=================");
    System.out.println("=================");

    registerCourseStudent(studentCourse);   //2번 호출
    registerCourseStudent(highStudentCourse); //스튜던트 이하는 허용했으므로 가능
    //워커, 펄슨 사용할 수 없는 이유 : 제약 범주를 벗어남

    System.out.println("=================");
    System.out.println("=================");
    System.out.println("=================");

    registerCourseWorker(workerCourse);  //2번 호출
    registerCourseWorker(personCourse);

  }

  // 모든 과정(모든 수강생)
  public static void registerCourse(Course<?> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStuedents()));
  }
  // Arrays.toString - 배열 자체를 문자열화 시켜줌(문자열로 만듦)

  //학생 수강생
  public static void registerCourseStudent(Course<? extends Student> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStuedents()));
  }

  //직장인 수강생
  public static void registerCourseWorker(Course<? super Worker> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStuedents()));
  }
}
