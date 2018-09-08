package com.springs.config;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.postgresql.Driver;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BenDefinitions {
	 
	@PostConstruct
	public void startup() {
		  
	}
	
	@PreDestroy
	public void cleanUp() throws Exception {
		// This manually unregisters JDBC driver, which prevents Tomcat 7 from complaining about memory leaks for this class
	    Enumeration<java.sql.Driver> drivers = DriverManager.getDrivers();
	    while (drivers.hasMoreElements()) {
	        Driver driver = (Driver) drivers.nextElement();
	        try {
	            DriverManager.deregisterDriver(driver);
	             } catch (SQLException e) {
	           
	            }
	    }
	}

}
