package br.com.nass.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
public class ForumApplication {

	public static void main(String[] args) {
		//Código usado para encodar uma senha para criação de usuário
		//System.out.println(new BCryptPasswordEncoder().encode("123456"));
		SpringApplication.run(ForumApplication.class, args);
	}

}
