package ejercicios.modelo;


public class Empleado {
	
	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer horasTrabajadas;
	private Float valorPorHora;
	

	
	public Empleado(String nombre, String apellido, Integer dni, Integer horasTrabajadas, Float valorPorHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.valorPorHora = valorPorHora;
	}
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public Float getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(Float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Float calcularSueldo() {

		return this.horasTrabajadas * this.valorPorHora;
		
	}
	
	public void imprimir() {
		System.out.println("################################");
		System.out.println(this.getNombre() +" "+ this.getApellido());
		System.out.println("DNI:" + this.getDni());
		System.out.println("Horas Trabajadas:" + this.getHorasTrabajadas());
		System.out.println("Cobra por Hora:" + this.getValorPorHora());
		System.out.println("Total a Cobrar:" + this.calcularSueldo());
		System.out.println("################################");
	}
	
	

}