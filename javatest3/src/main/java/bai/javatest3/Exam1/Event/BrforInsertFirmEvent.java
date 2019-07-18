package bai.javatest3.Exam1.Event;

import org.springframework.context.ApplicationEvent;

public class BrforInsertFirmEvent extends ApplicationEvent {
    private String message;

    public  BrforInsertFirmEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
