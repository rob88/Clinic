package dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



import Entity.Clinic;


/* 
 * ClinicCiteNames is a class acts like a fake database
 *This is the Controller Class , Implement the ClinicService Class
 *@author Ruben Faraj
 *@verson 0.1 
 *@Date 19-04-2017 
 */
@Repository 
public class ClinicCitesNames {

    // Creating a hashmap	
	private static Map<Integer, Clinic> clinicCity;// Creating a Hashmap
	
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			ClinicCitesNames clinic = restTemplate.getForObject("https://data.gov.uk/data/api/service/health/clinics?city=London ", ClinicCitesNames.class);
			//log.info(clinic.toString());
			
		};
	}
	
	//getClinicCity details display all the record in the database 
public Collection<Clinic>getClinicCity(){
	return this.clinicCity.values();
}


//get Clinic details by id 
public Clinic getClinicById(int id){
	
	return this.clinicCity.get(id);
	
}


//get Clinic details by partial_postcodes
public Clinic getClinicPostcode(String partial_postcodes){
	
	return this.clinicCity.get(partial_postcodes);
	
}



}