package net.zdsoft.springboot.samples.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.zdsoft.springboot.samples.mybatisplus.mapper")
public class SpringBootSamplesMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSamplesMybatisPlusApplication.class, args);
    }

}
