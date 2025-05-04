package br.com.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.lojavirtual.database")
public class LojavirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojavirtualApplication.class, args);
	}

}
