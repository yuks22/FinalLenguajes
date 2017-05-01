package SistemaRecomendaciones;

import java.util.*;

public class Asignatura {
	public String nombre;
	public String carrera;
	public String idioma;
	private String id_asingtura;
	List<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
	
	public void setId(String id_asingtura){
		this.id_asingtura = id_asingtura;
	}
	
	public String getId(){
		return this.id_asingtura;
	}
}
