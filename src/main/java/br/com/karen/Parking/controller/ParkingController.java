package br.com.karen.Parking.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.karen.Parking.controller.DTO.ParkingDTO;
import br.com.karen.Parking.controller.mapper.ParkingMapper;
import br.com.karen.Parking.model.Parking;
import br.com.karen.Parking.services.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {

	@Autowired
	private ParkingService parkingService;
	
	@Autowired
	private ParkingMapper parkingMapper;

	@GetMapping
	public List<ParkingDTO> findAll() {
		List<Parking> parkingList = parkingService.findAll();
		List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
		return result;

	}

}
