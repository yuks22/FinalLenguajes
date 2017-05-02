package SistemaRecomendaciones;

public class AlumnoAsignatura {
	private String id_asingtura;
	private String matricula;
	public double promedio;
	
	private double obtenerPromedio(){
		//como se sacara el promedio?
		double promedioA=0; 
		
		return promedioA;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setId(String id_asingtura){
		this.id_asingtura = id_asingtura;
	}
	
	public String getId(){
		return this.id_asingtura;
	}
}