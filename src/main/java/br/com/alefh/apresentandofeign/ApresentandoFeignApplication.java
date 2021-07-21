package br.com.alefh.apresentandofeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ApresentandoFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApresentandoFeignApplication.class, args);
	}

}
