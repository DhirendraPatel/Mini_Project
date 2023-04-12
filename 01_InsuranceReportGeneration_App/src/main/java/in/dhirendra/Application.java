package in.dhirendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.dhirendra.runner.DataLoader_Runner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
		
	}

}
