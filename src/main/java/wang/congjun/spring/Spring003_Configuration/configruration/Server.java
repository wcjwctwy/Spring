package wang.congjun.spring.Spring003_Configuration.configruration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangcongjun on 2017/6/24.
 */
@RestController
public class Server {
    @Autowired
    private BootConfiguration bootConfiguration;


    @RequestMapping("/test/{id}")
    public String heelo(@PathVariable String id){
        return bootConfiguration.getName();
//        return id;
    }
}
