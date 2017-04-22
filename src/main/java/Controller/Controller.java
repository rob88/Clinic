package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import Entity.Clinic;
import Services.ClinicService;

import java.util.Collection;


/* 
 *Class  Controller
 *This is the Controller Class , Implement the ClinicService Class
 *@author Ruben Faraj
 *@verson 0.1 
 *@Date 19-04-2017 
 */
@RestController 
@RequestMapping("/clinicCity") // first endpoint to display all data
public class Controller {
	
	@Autowired
	private ClinicService clinicService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Clinic>getClinicCity(){
		return clinicService.getClinicCity();// Calling getClinicCity method in ClinicCitesNames class
	}
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET) // second endpoint to display clinic by id
	public Clinic getClinicById(@PathVariable("id") int id){   // @pathvariable is gathering id from the url
		
		return this.clinicService.getClinicById(id);
		
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}