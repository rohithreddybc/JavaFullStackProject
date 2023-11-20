package com.rohith.location.services;

import java.util.List;

import com.rohith.location.entities.location;

public interface LocationService {

	location saveLocation(location location);

	location updateLocation(location location);

	void deleteLocation(location location);

	location getLocationById(int id);

	List<location> getAllLocations();

}
