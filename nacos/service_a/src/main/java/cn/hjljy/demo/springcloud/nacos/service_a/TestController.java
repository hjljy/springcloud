package cn.hjljy.demo.springcloud.nacos.service_a;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjljy
 */
@RestController
public class TestController {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Im Service A " + string;
    }
}
