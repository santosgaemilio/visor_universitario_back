package prxima.visor.demo.model;

public class Properties2 {
	private String campus;
	private String propietario;
	private String expediente_num;
	private String superficie_m2;
	private String area_construida_m2;
	private String municipio;
	private Integer escritura_num;
	private String valor_com_terreno;
	private String valor_catastro_terreno;
		
	
	public Properties2() {
		super();
	}
	public Properties2(String campus, String propietario, String expediente_num, String superficie_m2,
			String area_construida_m2, String municipio, Integer escritura_num, String valor_com_terreno,
			String valor_catastro_terreno) {
		super();
		this.campus = campus;
		this.propietario = propietario;
		this.expediente_num = expediente_num;
		this.superficie_m2 = superficie_m2;
		this.area_construida_m2 = area_construida_m2;
		this.municipio = municipio;
		this.escritura_num = escritura_num;
		this.valor_com_terreno = valor_com_terreno;
		this.valor_catastro_terreno = valor_catastro_terreno;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getExpediente_num() {
		return expediente_num;
	}
	public void setExpediente_num(String expediente_num) {
		this.expediente_num = expediente_num;
	}
	public String getSuperficie_m2() {
		return superficie_m2;
	}
	public void setSuperficie_m2(String superficie_m2) {
		this.superficie_m2 = superficie_m2;
	}
	public String getArea_construida_m2() {
		return area_construida_m2;
	}
	public void setArea_construida_m2(String area_construida_m2) {
		this.area_construida_m2 = area_construida_m2;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public Integer getEscritura_num() {
		return escritura_num;
	}
	public void setEscritura_num(Integer escritura_num) {
		this.escritura_num = escritura_num;
	}
	public String getValor_com_terreno() {
		return valor_com_terreno;
	}
	public void setValor_com_terreno(String valor_com_terreno) {
		this.valor_com_terreno = valor_com_terreno;
	}
	public String getValor_catastro_terreno() {
		return valor_catastro_terreno;
	}
	public void setValor_catastro_terreno(String valor_catastro_terreno) {
		this.valor_catastro_terreno = valor_catastro_terreno;
	}
	
	
}
