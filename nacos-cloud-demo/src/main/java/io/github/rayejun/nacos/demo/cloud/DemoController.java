package io.github.rayejun.nacos.demo.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {

    @Value("${key}")
    String value;

    @RequestMapping("hello")
    public String hello() {
        return value;
    }
}
