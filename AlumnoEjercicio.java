package SistemaRecomendaciones;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class AlumnoEjercicio {
	private String id_ejercicio;
	private String matricula;
	public int estado = 0;
	public int calificacion = 10;
	public int intento = 0;
	public Date fecha_inic;
	public Date fecha_fin;
	
	private static long calcularTiempo(Date fecha_inic, Date fecha_fin){	
		//posible solucion
		long tiempo = fecha_fin.getTime() - fecha_inic.getTime();
	    return TimeUnit.DAYS.convert(tiempo, TimeUnit.MILLISECONDS);
	}
	
	private void iniciarEjercicio(){
		fecha_inic = new Date();
		estado=1;
	}
	private void finalizarEjercicio(){
		fecha_fin = new Date();
		intento = intento +1;
		estado = 2;

	}
	private double calcularCalificacion(){
		//Como?
		double calif=0; 
		
		return calif;
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
