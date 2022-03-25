package net.zdsoft.springboot.samples.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.zdsoft.springboot.samples.mysql.mapper")
public class SpringBootSamplesMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSamplesMysqlApplication.class, args);
    }

}
