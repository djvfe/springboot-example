package jerry.sbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

import jerry.sbe.controller.ActionController;

@SpringBootConfiguration
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(ActionController.class, args);
	}

}
