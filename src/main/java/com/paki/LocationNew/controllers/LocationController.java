package com.paki.LocationNew.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.paki.LocationNew.entities.Location;
import com.paki.LocationNew.repo.LocationRepository;
import com.paki.LocationNew.service.LocationService;
import com.paki.LocationNew.util.EmailUtil;
import com.paki.LocationNew.util.ReportUtil;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	
	@Autowired
	LocationRepository repository;
	
	@Autowired
	EmailUtil emailUtil;
	
	@Autowired
	ReportUtil reportUtil;
	
	@Autowired
	ServletContext sc;
	
	@RequestMapping("/showCreate")
	public String showCreate(){
		return "createLocation";
		
	}
	
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap){
		Location locationSaved=service.saveLocation(location);
		String msg="Location saved with id: "+locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		emailUtil.sendEmail("srdan25@gmail.com", "Location is saved", "Location is saved successufuly and response return");
		
		return "createLocation";
		
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap){
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		
		return "displayLocations";
		
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap){
		//Location location = service.getLocationById(id);
		Location location=new Location();
		location.setId(id);
		service.deleteLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
		
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap){
		Location location=service.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
		
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap){
		service.updateLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
		
	}
	
	
	
	@RequestMapping("/generateReport")
	public String generateReport(){
		
		String path=sc.getRealPath("/");
		
		List<Object[]> data = repository.findTypeAndTypeCount();
		
		reportUtil.generatePieChart(path, data);
		return "report";
		
	}
	
	
	
	
	
	
	
	

}
