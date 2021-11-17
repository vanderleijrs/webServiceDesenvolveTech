package webServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"webServices"})
public class WebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServicesApplication.class, args);
	}

}
