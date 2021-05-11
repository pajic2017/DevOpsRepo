package com.paki.LocationNew.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paki.LocationNew.entities.Location;
import com.paki.LocationNew.repo.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {
	
	@Autowired
	LocationRepository locationRepository;
	
	@GetMapping
	List<Location> getLocations(){
		return locationRepository.findAll();
		
	}
	
	@PostMapping
	public Location createLocation(@RequestBody Location location){
		return locationRepository.save(location);
		
	}
	
	@PutMapping
	public Location updateLocation(@RequestBody Location location){
		return locationRepository.save(location);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id){
		locationRepository.deleteById(id);
		
	}
	
	@GetMapping("/{id}")
	public Location getLocation(@PathVariable("id")int id){
		return locationRepository.findById(id).get();
		
		
	}
	
	


}
