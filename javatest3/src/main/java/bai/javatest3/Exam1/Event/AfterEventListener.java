package bai.javatest3.Exam1.Event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AfterEventListener implements ApplicationListener<AfterInsertFirmEvent> {

    public void onApplicationEvent(AfterInsertFirmEvent event) {
        System.out.println(event.getMessage());
    }
}
