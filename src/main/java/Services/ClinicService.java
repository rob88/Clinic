package Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import Entity.Clinic;
import dao.ClinicCitesNames;



@Service
public class ClinicService {

	@Autowired
	private ClinicCitesNames ClinicCitesNames;

	public Collection<Clinic> getClinicCity() {
		return this.ClinicCitesNames.getClinicCity();// Calling getClinicCity method  in ClinicCitesNames class
	}

	// get Clinic details by id
	public Clinic getClinicById(int id) {

		return this.ClinicCitesNames.getClinicById(id); // Calling getClinicById method in ClinicCitesNames class

	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
