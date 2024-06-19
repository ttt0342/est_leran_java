package Java_240619;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Collection_HashTable {
  public static void main(String[] args) {
    Map<String, String> map = new Hashtable<>();
    Scanner scanner = new Scanner(System.in);

    map.put("spring", "qwer");
    map.put("summer", "qwer1234");
    map.put("fall", "qwer123");
    map.put("winter", "qwer123");

    while (true) {
      System.out.println("아이디와 비밀번호를 입력해주세요");
      System.out.println("아이디 : ");
      String id = scanner.nextLine();

      System.out.println("비밀번호 : ");
      String password = scanner.nextLine();

      System.out.println("================");

      if (map.containsKey(id)) { // 입력받은 id가 있음
        String mapPassword = map.get(id);
        if (mapPassword.equals(password)) {
          System.out.println("로그인에 성공했습니다.");
          break;
        } else {
          System.out.println("입력하신 비밀번호가 틀렸습니다.");
        }

      } else { // id가 키 값에 존재하지 않는다.
        System.out.println("입력하신 아이디가 존재하지 않습니다.");
      }
    }scanner.close();
  }
}
