package Entity;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/* 
 *Class  ClinicCity
 *This Class contain a collections of variables ,
 *will be used by the system getter and setter methods & Business logic Methods 
 *@author Ruben Faraj
 *@verson 0.1 
 *@Date 19-04-2017 
 **/

public class Clinic {

	// list Variables
	int id;
	private String city;
	private String partial_postcodes;
	private boolean isHealthy;

	/* constructor */
	public Clinic() {
	}

	/*
	 * ==List of getter and setter methods for all of the above variables
	 * =======================================================================
	 */

	/*
	 * @method getId
	 * @type getter method
	 * @param
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/*
	 * @method SetId
	 * @type setter method
	 * @param id
	 * 
	 * @return id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * @method getCity
	 * type getter method
	 * @param
	 * 
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/*
	 * @method getCity
	 * 
	 * @type setter method
	 * 
	 * @param city
	 * 
	 * @return city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * @method getPartial_postcodes
	 * 
	 * @type getter method
	 * 
	 * @param
	 * 
	 * @return partial_postcodes
	 */
	public String getPartial_postcodes() {
		return partial_postcodes;
	}

	/*
	 * @method getPartial_postcodes
	 * 
	 * @type Setter method
	 * 
	 * @param partial_postcodes
	 * 
	 * @return partial_postcodes
	 */
	public void setPartial_postcodes(String partial_postcodes) {
		this.partial_postcodes = partial_postcodes;
	}

	/*
	 * @method isHealthy
	 * 
	 * @type getter method
	 * 
	 * @param
	 * 
	 * @return isHealthy
	 */
	public boolean isHealthy() {
		return isHealthy;
	}

	/*
	 * @method isHealthy
	 * 
	 * @type Setter method
	 * 
	 * @param isHealthy
	 * 
	 * @return isHealthy
	 */
	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}/* ===== End of getter and setter methods ================ */

	/*
	 * -- List of Business logic methods
	 * ---------------------------------------------------------------
	 */

	/*
	 * @method countPostCode // Business Logic !!! this method will be used for
	 * counting total number of partial_postcodes
	 * 
	 * @ return total number of partial_postcodes matches the a given city names
	 */
	public static int countPostCode(List<Clinic> collections, String city, String partial_postcodes) {
		int count = 0;
		for (Clinic item : collections) {
			if (item.getPartial_postcodes().equals(city)) {
				count++;
			}
		}
		return count;
	}

}// end Class