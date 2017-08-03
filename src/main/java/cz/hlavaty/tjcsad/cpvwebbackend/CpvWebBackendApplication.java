package cz.hlavaty.tjcsad.cpvwebbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class CpvWebBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpvWebBackendApplication.class, args);
	}
}
