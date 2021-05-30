package cn.hjljy.springcloud.openfeign.consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjljy
 */
@RestController
public class ConsumeController {

    @Autowired
    OpenFeignService openFeignService;

    /**
     * 获取name
     *
     * @param name
     * @return {@link String}
     */
    @RequestMapping("/consume/{name}")
    public String getName(@PathVariable String name) {
        return openFeignService.getName(name);
    }
}
