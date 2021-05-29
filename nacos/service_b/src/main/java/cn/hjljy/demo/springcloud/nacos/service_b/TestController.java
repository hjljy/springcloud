package cn.hjljy.demo.springcloud.nacos.service_b;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author hjljy
 */
@RestController
public class TestController {


    private final RestTemplate restTemplate;

    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return restTemplate.getForObject("http://service-a/echo/" + string, String.class);
    }
}
