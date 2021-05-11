package com.paki.LocationNew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paki.LocationNew.entities.Location;
import com.paki.LocationNew.repo.LocationRepository;

@Service
public class LocServTestImpl implements LocServTest {
	
	@Autowired
	LocationRepository repo;
	
	@Override
	public Location saveLoc(Location loco){
		return repo.save(loco);
	}
	
	@Override
	public Location updateLoc(Location loco){
		return repo.save(loco);
		
	}
	
	@Override
	public List<Location> findAllLoc(){
		return repo.findAll();
		
	}
	
	@Override
	public Location findOneLoc(int num){
		return repo.findById(num).get();
		
	}
	
	@Override
	public void deleteLoc(Location loco){
		repo.delete(loco);
	}

}
