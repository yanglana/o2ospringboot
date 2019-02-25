package cn.yang.o2o;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author yanglan
 * @Date 2019/2/15 17:53
 */
@RestController
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello SpringBoot!";
    }
}
