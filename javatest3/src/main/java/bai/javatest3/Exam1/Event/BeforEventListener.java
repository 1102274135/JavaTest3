package bai.javatest3.Exam1.Event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class BeforEventListener implements ApplicationListener<BrforInsertFirmEvent> {

    public void onApplicationEvent(BrforInsertFirmEvent event) {
        System.out.println(event.getMessage());
    }
}
