package Clinics.Clinic;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import Entity.Clinic;
import dao.ClinicCitesNames;


/*  
 * Class Main 
 * this class will start the application when the code compiled 
 *@author Ruben Faraj
 *@verson 0.1 
 *@Date 19-04-2017
 *  */ 

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}


}