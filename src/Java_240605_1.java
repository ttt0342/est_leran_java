public class Java_240605_1 {
  public static void main(String[] args) {
    // 문자열 배열 String[] words가 주어집니다. 이 배열에는 여러 단어들이 저장되어 있습니다.
    // 이중 포문을 사용하여 모든 단어 쌍의 조합을 출력하는 프로그램을 작성하세요.
    // 단, 같은 단어를 중복해서 출력하면 안 되며, 단어 쌍의 순서는 고려하지 않습니다.
    String[] words = {"apple", "banana", "cherry", "durian"};
    //    for (int i = 0; i <= words.length; i++) {
    //      for (int j = i + 1; j < words.length; j++) {
    //        System.out.println(words[i] + " " + words[j]);
    //      }
    //    }

    // 풀이
//    for (int i = 0; i < words.length - 1; i++) { // 부모 for문은 두리안까지 갈 필요 없음, 그래서 길이에 -1
//      for (int j = i + 1; j < words.length; j++) {
//        System.out.println(words[i] + " " + words[j]);
//      }
//    }
    //for와 foreach의 차이점
    //foreach는 요소에 바로 접근
    //for는 인덱스를 통해 요소에 접근
//foreach 활용하여 풀기 그러나 추천하지는 않음 for문을 통해 푸는 것이 덜 복잡함
//    int index = 0;
//    for(String word : words){
//      for(int i = index+1; i < words.length; i++){
//        String word2 = words[i];
//        System.out.println(word + " " + word2);
//      }
//      index++;
//    }

    //    예시 출력:
    // apple banana
    // apple cherry
    // apple durian
    // banana cherry
    // banana durian
    // cherry durian
  }
}
