package prxima.visor.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import prxima.visor.demo.model.Campus;

public interface CampusRepository extends MongoRepository<Campus, String>{
	
	@Query("{name:'?0'}")
	Optional<Campus> findCampusByName(String name);
}
