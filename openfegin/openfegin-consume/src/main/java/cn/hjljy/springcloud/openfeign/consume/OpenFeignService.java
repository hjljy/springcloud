package cn.hjljy.springcloud.openfeign.consume;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hjljy
 */
@FeignClient("feign-provider")
@Service
public interface OpenFeignService {

    /**
     * 获取name
     *
     * @param name
     * @return {@link String}
     */
    @RequestMapping("/provider/{name}")
    String getName(@PathVariable String name);
}
