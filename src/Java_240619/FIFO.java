package Java_240619;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
  public static void main(String[] args) {
    Queue<FIFO_Message> messageQueue = new LinkedList<>(); // 메세지 객체만 들어감

    messageQueue.offer(new FIFO_Message("sendMail", "홍길동"));
    messageQueue.offer(new FIFO_Message("sendSms", "제니"));
    messageQueue.offer(new FIFO_Message("sendKakaoTalk", "리사"));
    messageQueue.offer(new FIFO_Message("sendWeeklyQuiz", "김승조"));

    while (!messageQueue.isEmpty()) {
      FIFO_Message message = messageQueue.poll();
      //peek 사용 시 홍길동만 무한 루프
      //처음 들어간 것이 홍길동이기 때문에
      switch (message.getCommand()) {
        case "sendMail":
          System.out.println(message.getTo() + "에게 메일을 보냅니다.");
          break;

        case "sendSms":
          System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
          break;

        case "sendKakaoTalk":
          System.out.println(message.getTo() + "에게 카카오톡을 보냅니다.");
          break;

        default:
          System.out.println(message.getTo() + "에게 아무거나 보냅니다.");
          break;
      }
    }
  }
}
