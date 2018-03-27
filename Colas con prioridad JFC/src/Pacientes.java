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
	
	
	/**
	 * Contructor de la clase
	 * @param nombre
	 * @param sintoma
	 * @param codigo
	 */
	public Pacientes(String nombre, String sintoma, String codigo){
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.codigo = codigo;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Pacientes p) {
		return this.getCodigo().compareTo(p.getCodigo());
	}
	

	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the sintoma
	 */
	public String getSintoma() {
		return sintoma;
	}

	/**
	 * @param sintoma the sintoma to set
	 */
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public  String toString(){
		return "El paciente: "+ this.getNombre() +"\nSintoma: "+this.getSintoma()+"\nCodigo: "+this.getCodigo();        
	}
}
