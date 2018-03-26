/**
 * Clase Paciente
 * @author Raul Monzon, 15014
 * @author David Valenzuela, 171001
 * @fecha 03/25/2018
 */
public class Pacientes implements Comparable <Pacientes>{
	// Atributos de la clase
	private String nombre;//Este atributo guarda el nombre del paciente a atender
	private String sintoma;//Este atributo guarda el sintoma que tiene el paciente
	private String codigo;//Este atributo nos ayuda a saber la prioridad del paciente
	
	
	public Pacientes(String nombre, String sintoma, String codigo){
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.codigo = codigo;
	}
	
	public int compareTo(Pacientes p) {
		return this.getCodigo().compareTo(p.getCodigo());
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setSintoma(String sintoma){
		this.sintoma = sintoma;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getSintoma(){
		return sintoma;
	}
	
	public String getCodigo(){
		return codigo;
	}
	
	public  String toString(){
		return "El paciente: "+ this.getNombre() +"\nSintoma: "+this.getSintoma()+"\nCodigo: "+this.getCodigo();        
	}
}
