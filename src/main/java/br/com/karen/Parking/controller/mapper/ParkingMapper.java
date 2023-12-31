package br.com.karen.Parking.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.karen.Parking.controller.DTO.ParkingDTO;
import br.com.karen.Parking.model.Parking;

@Component
public class ParkingMapper {
	
	private static final ModelMapper MODEL_MAPPER = new ModelMapper();
	
	public ParkingDTO parkingDTO(Parking parking) {
		return MODEL_MAPPER.map(parking, ParkingDTO.class);
	}
	
	public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList){
		return parkingList.stream().map(this::parkingDTO.collect(Collectors.toList()));
		
	}
	

}
