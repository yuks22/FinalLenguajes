package SistemaRecomendaciones;

public class Ejercicio {
	public String nombre;
	public String descripcion;
	private String id_ejercicio;
	public int dificultad;
	
	public void setId(String id_ejercicio){
		this.id_ejercicio = id_ejercicio;
	}
	
	public String getId(){
		return this.id_ejercicio;
	}
}
