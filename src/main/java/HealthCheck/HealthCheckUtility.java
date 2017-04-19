package HealthCheck;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class HealthCheckUtility {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckUtility.class);
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-mm-dd HH:mm");
	private static final String LOG_FORMAT = "%s %d %d %d %d\n";

}
