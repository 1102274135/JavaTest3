package bai.javatest3;

import bai.javatest3.Exam1.Service.InsertFirm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Javatest3Application {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Javatest3Application.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(Javatest3Application.class, args);
        InsertFirm insertFirm=new InsertFirm();
        insertFirm.insert();
    }

}
