package prxima.visor.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prxima.visor.demo.model.Campus;
import prxima.visor.demo.repository.CampusRepository;

@Service
public class CampusService {
	private final CampusRepository campusRepository;

	@Autowired
	public CampusService(CampusRepository campusRepository) {
		super();
		this.campusRepository = campusRepository;
	}
	
//	GET
	public Campus getCampusById(String id) {
		return campusRepository.findById(id).orElseThrow(()-> new IllegalStateException("El campus"
				+ "con el id: " +id+  " no existe"));
	}
	public Campus getCampusByName(String name) {
		return campusRepository.findCampusByName(name).orElseThrow(()-> new IllegalStateException("El campus"
				+ "con el nombre: " +name+  " no existe"));
	}
	
	public List<Campus> getAllCampus(){
		return campusRepository.findAll();
	}
}
