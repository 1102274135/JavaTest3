package bai.javatest3.Exam1.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher  {
    @Autowired
    private ApplicationContext applicationContext;

    public void publishBeforEvent(){
        BrforInsertFirmEvent event=new BrforInsertFirmEvent(this,"Befor Insert Firm Data");
        applicationContext.publishEvent(event);
    }
    public void publishAfterEvent(){
        AfterInsertFirmEvent event=new AfterInsertFirmEvent(this,"After Insert Firm Data");
        applicationContext.publishEvent(event);
    }
}
