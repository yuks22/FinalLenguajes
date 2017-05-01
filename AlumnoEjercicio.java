package SistemaRecomendaciones;

import java.util.*;

public class AlumnoEjercicio {
	private String id_ejercicio;
	private String matricula;
	public int estado;
	public int calificacion;
	public int intento;
	public Date fecha_inic;
	public Date fecha_fin;
	
	private static long calcularTiempo(Date fecha_inic, Date fecha_fin){	
		//posible solucion
		long tiempo = fecha_fin.getTime() - fecha_inic.getTime();
	    return TimeUnit.DAYS.convert(tiempo, TimeUnit.MILLISECONDS);
	}
	
	private void iniciarEjercicio(){
		//que hara?
	}
	private void finalizarEjercicio(){
		//que hara?
	}
	private double calcularCalificacion(){
		//Como?
		double calif=0; 
		
		return calif;
	}
	private int numeroIntentos(){
		//Como?
		int intentos=0; 
		
		return intentos;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setId(String id_ejercicio){
		this.id_ejercicio = id_ejercicio;
	}
	
	public String getId(){
		return this.id_ejercicio;
	}
	
}
