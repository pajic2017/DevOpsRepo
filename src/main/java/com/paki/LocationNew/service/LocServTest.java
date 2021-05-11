package com.paki.LocationNew.service;

import java.util.List;

import com.paki.LocationNew.entities.Location;

public interface LocServTest {
	
	public Location saveLoc(Location loco);
	public List<Location> findAllLoc();
	public Location findOneLoc(int num);
	public Location updateLoc(Location loco);
	public void deleteLoc(Location loco);
	
	//findTypeAndCountType  List<Object[]>

}
