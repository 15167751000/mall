package cn.dnaizn.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.dnaizn.mall.mapper")
public class MallActivityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallActivityServiceApplication.class, args);
    }

}
