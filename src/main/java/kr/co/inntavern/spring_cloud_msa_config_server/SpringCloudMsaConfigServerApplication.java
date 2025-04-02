package kr.co.inntavern.spring_cloud_msa_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudMsaConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMsaConfigServerApplication.class, args);
    }

}
