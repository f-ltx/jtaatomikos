package cn.ltx.jtaatomikos;

import cn.ltx.jtaatomikos.config.DBConfig1;
import cn.ltx.jtaatomikos.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class JtaatomikosApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtaatomikosApplication.class, args);
    }

}
