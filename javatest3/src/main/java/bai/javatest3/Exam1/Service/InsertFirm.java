package bai.javatest3.Exam1.Service;

import bai.javatest3.Exam1.Dao.Firm;
import bai.javatest3.Exam1.Dao.FirmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class InsertFirm {

    @Autowired
    private FirmRepository firmRepository;

    @Transactional
    public void insert(){
        AbstractXmlApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
        //从配置文件中获取环境变量中firm的属性
        Firm firm= (Firm) ac.getBean("firm");
        firmRepository.save(firm);
    }
}
