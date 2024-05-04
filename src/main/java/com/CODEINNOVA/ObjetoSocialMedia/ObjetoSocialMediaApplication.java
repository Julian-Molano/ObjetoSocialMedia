package com.CODEINNOVA.ObjetoSocialMedia;

import com.CODEINNOVA.ObjetoSocialMedia.entities.LogIn;
import com.CODEINNOVA.ObjetoSocialMedia.repository.LogInRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObjetoSocialMediaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObjetoSocialMediaApplication.class, args);
		context.getBean(LogInRepository.class);
		LogInRepository repository = context.getBean(LogInRepository.class);

		// CRUD

		// crear un log in
		LogIn login1 = new LogIn("julian", "julian@gmail.com", 123456, true);
		LogIn login2 = new LogIn("julianM", "julianM@gmail.com", 654321, true);

		// almacenar log in
		System.out.println("CANTIDAD DE LOG IN´S" + repository.findAll().size());
		repository.save(login1);
		repository.save(login2);

		// recuperar todos los log in
		System.out.println("CANTIDAD DE LOG IN´S" + repository.findAll().size());

		// borrar un log in
		repository.deleteById(String.valueOf(1));
		System.out.println("CANTIDAD DE LOG IN´S" + repository.findAll().size());


	}

}
