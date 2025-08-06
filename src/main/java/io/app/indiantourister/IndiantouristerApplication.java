package io.app.indiantourister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "io.app.indiantourister")
@EnableAutoConfiguration
@EnableJpaRepositories
@EnableJpaAuditing
public class IndiantouristerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndiantouristerApplication.class, args);
	}

}
