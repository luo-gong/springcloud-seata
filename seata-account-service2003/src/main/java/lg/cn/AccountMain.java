package lg.cn;

import io.seata.config.springcloud.EnableSeataSpringConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(basePackages = "lg.cn.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class AccountMain {
    public static void main(String[] args) {
        SpringApplication.run(AccountMain.class, args);
    }
}
