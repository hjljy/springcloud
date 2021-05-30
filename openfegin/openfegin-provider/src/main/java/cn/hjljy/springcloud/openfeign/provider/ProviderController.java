package cn.hjljy.springcloud.openfeign.provider;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjljy
 */
@RestController
public class ProviderController {

    /**
     * 获取name
     *
     * @param name
     * @return {@link String}
     */
    @RequestMapping("/provider/{name}")
    public String getName(@PathVariable String name) {
        return "Hello Im provider" + name;
    }
}
