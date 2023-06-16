package prxima.visor.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prxima.visor.demo.model.Campus;
import prxima.visor.demo.services.CampusService;

@RestController
@RequestMapping("/campus")
public class CampusController {
	private final CampusService campusService;
	
	@Autowired
	public CampusController(CampusService campusService) {
		super();
		this.campusService = campusService;
	}
	
//	GET
	@GetMapping
	public List<Campus> getCampus(){
		return campusService.getAllCampus();
	}
	
	@GetMapping(path = "/name/{name}")
	public Campus getCampusByName(@PathVariable("name") String name) {
		return campusService.getCampusByName(name);
	}
	
	@GetMapping(path = "/id/{id}")
	public Campus getCampusById(@PathVariable("id") String id){
		return campusService.getCampusById(id);
	}
	
	
	
}
