package SistemaRecomendaciones;

import java.util.*;

public class Asignatura {
	public String nombre;
	public String carrera;
	public String idioma;
	private int id_asingtura;
	List<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
	
	public void setId(int id_asingtura){
		this.id_asingtura = id_asingtura;
	}
	
	public int getId(){
		return this.id_asingtura;
	}
}
