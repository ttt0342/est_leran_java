package Java_240619;

public class FIFO_Message {
    private String command;
    private String to;

    public FIFO_Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }
}
