package deors.demos.microservices.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.config.server.EnableConfigServer
public class DeorsDemosMicroservicesConfigserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeorsDemosMicroservicesConfigserviceApplication.class, args);
	}
}
