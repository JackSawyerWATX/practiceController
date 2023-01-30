package com.jacksawyer.LocationController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class LocationController{

    @RequestMapping ("/?/{city}/{county}/{state}")
    	public String getLocation(@PathVariable long id, 
    	@PathVariable String state,

    	@PathVariable("County") 
    	String county, 

    	@PathVariable("City")
    	String city){
    		return "State: "+ state +", County: "+ county +", City: "+ city;
    	}
    }
