package cl.intohybrid.restdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import cl.intohybrid.restdemo.modelo.Blog;
import cl.intohybrid.restdemo.repository.BlogRepository;

@SpringBootApplication
public class Boot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot1Application.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(BlogRepository blogRepository) {
		return (args) -> {
			blogRepository.save(new Blog("titulo1", "contenido1"));
			blogRepository.save(new Blog("titulo2", "contenido2"));
			blogRepository.save(new Blog("titulo3", "contenido3"));
			blogRepository.save(new Blog("titulo4", "contenido4"));
		};
		
	}
}
