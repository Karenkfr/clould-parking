package br.com.karen.Parking.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.karen.Parking.model.Parking;


@Service
public class ParkingService {
	
	public List<Parking> findAll(){
		return parkingMap.values().stream().collect(Collectors.toList());
		
	}
	
	private static Map<String, Parking> parkingMap = new HashMap<>();
	
	static {
		var id = getUUID();
		Parking parking = new Parking(id, "DMS-1111", "RS", "CELTA", "PRETO");
		parkingMap.put(id, parking);
	}

	private static String getUUID() {
		
		return UUID.randomUUID().toString().replace("-", "");
		
	}

}
