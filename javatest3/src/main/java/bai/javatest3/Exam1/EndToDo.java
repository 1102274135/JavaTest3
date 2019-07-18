package bai.javatest3.Exam1;

import org.springframework.beans.factory.DisposableBean;

public class EndToDo implements DisposableBean {

    public void destroy() throws Exception {

        System.out.println("Context Stop");

    }


}
