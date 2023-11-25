package com.rohith.location.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rohith.location.entities.location;
import com.rohith.location.repositories.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	LocationRepository locationRepository;

	@Override
	public location saveLocation(location location) {

		return locationRepository.save(location);

	}

	@Override
	public location updateLocation(location location) {

		return locationRepository.save(location);

	}

	@Override
	public void deleteLocation(location location) {
		locationRepository.delete(location);

	}

	@Override
	public location getLocationById(int id) {

		return locationRepository.findById(id).get();
	}

	@Override
	public List<location> getAllLocations() {

		return locationRepository.findAll();
	}

}
