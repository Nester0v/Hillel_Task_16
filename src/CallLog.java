import java.time.LocalDateTime;

public class CallLog {
    private LocalDateTime logTime;
    private String name;
    private String surname;
    private String callNumber;

    public CallLog(LocalDateTime logTime, String name, String surname, String callNumber) {
        this.logTime = logTime;
        this.name = name;
        this.surname = surname;
        this.callNumber = callNumber;

    }
}
