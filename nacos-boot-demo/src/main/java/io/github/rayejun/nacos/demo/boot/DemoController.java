package io.github.rayejun.nacos.demo.boot;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @NacosValue(value = "${key}", autoRefreshed = true)
    String value;

    @NacosValue("${key}")
    String value1;

    @RequestMapping("hello")
    public String hello() {
        return value;
    }

    @RequestMapping("hello1")
    public String hello1() {
        return value1;
    }
}
