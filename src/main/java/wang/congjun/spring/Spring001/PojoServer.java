package wang.congjun.spring.Spring001;

import org.springframework.beans.factory.annotation.Autowired;
import wang.congjun.spring.Spring.Pojo;

/**
 * Created by wangcongjun on 2017/6/12.
 */
//@Service
public class PojoServer {
    @Autowired
    private Pojo pojo;

//    public void setPojo(Pojo pojo) {
//            this.pojo = pojo;
//    }

    public void savePojo(){
        System.out.println("save :"+pojo.toString());
    }
}
