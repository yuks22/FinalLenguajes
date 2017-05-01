package SistemaRecomendaciones;

public class Ejercicio {
	public String nombre;
	public String descripcion;
	private int id_ejercicio;
	public int dificultad;
	
	public void setId(int id_ejercicio){
		this.id_ejercicio = id_ejercicio;
	}
	
	public int getId(){
		return this.id_ejercicio;
	}
}
