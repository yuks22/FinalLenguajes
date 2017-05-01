package SistemaRecomendaciones;

public class Alumno {
	private String matricula;
	public String nombre;
	public String apellido;
	public String carrera;
	public int semestre;
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
}
