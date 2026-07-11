package hk.ljx.fishbox.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("hk.ljx.fishbox.auth.domain.mapper")
public class FishboxAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishboxAuthApplication.class, args);
    }

}
