package prxima.visor.demo.model;



public class Crs {
	private String type;
	private Properties1 properties;
	
	
	public Crs() {
		super();
	}
	public Crs(String type, Properties1 properties) {
		super();
		this.type = type;
		this.properties = properties;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Properties1 getProperties() {
		return properties;
	}
	public void setProperties(Properties1 properties) {
		this.properties = properties;
	}
	
	
}
