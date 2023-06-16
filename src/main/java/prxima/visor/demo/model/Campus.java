package prxima.visor.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Document(collection = "test1")
public class Campus {
//	Estos son los campos originales, voy a tratar de ponerlos todos
	@Id
	@Field("_id")
	private String id;
	private String type;
	private String name;
//	////////////////////////////////////////////////////////////////
	private Crs crs;
	private List<Feature> features;
	
	public Campus() {
		super();
	}
	public Campus(String id, String type, String name, Crs crs, List<Feature> features) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.crs = crs;
		this.features = features;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Crs getCrs() {
		return crs;
	}
	public void setCrs(Crs crs) {
		this.crs = crs;
	}
	public List<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	
	
	
	
}
