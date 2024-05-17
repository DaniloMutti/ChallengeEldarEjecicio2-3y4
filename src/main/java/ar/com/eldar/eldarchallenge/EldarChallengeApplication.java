package ar.com.eldar.eldarchallenge;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ar.com.eldar.eldarchallenge.utils.CargaBase;



@SpringBootApplication
public class EldarChallengeApplication {
	
	@Bean
    public CommandLineRunner init(@Autowired CargaBase cargaBase){
        return args -> {
            cargaBase.cargaBaseInicial();


        };
    }
	
	public static void main(String[] args) {
		SpringApplication.run(EldarChallengeApplication.class, args);
	}
	
}
