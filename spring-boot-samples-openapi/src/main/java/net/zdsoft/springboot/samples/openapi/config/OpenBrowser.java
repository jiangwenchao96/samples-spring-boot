package net.zdsoft.springboot.samples.openapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author jwc
 * @date 2022/3/25
 */
@Component
public class OpenBrowser implements CommandLineRunner {
    @Value("${server.port}")
    private String port;

    @Override
    public void run(String... args) throws Exception {
        String url = "http://localhost:" + port + "/swagger-ui/index.html" ;
        System.out.println("启动浏览器，访问" + url);
        Runtime.getRuntime().exec("cmd /c start " + url);
    }
}
