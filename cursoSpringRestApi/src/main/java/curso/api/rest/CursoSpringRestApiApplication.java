package curso.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan(basePackages = {"curso.api.rest.model"})
@ComponentScan(basePackages = {"curso.*"})
@EnableJpaRepositories(basePackages = {"curso.api.rest.repository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
public class CursoSpringRestApiApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(CursoSpringRestApiApplication.class, args);
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/usuario")
		.allowedMethods("*")//libera para os metodos descritos como parâmetros
		.allowedOrigins("*");//libera para os servidores listados
	}

}
