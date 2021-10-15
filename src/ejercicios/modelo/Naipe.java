package ejercicios.modelo;

public class Naipe {
	
	private String figura;
	private Integer numero;
	
	
	
	public Naipe(String figura, Integer numero) {
		this.figura = figura;
		this.numero = numero;
	}
	public String getFigura() {
		return figura;
	}
	public void setFigura(String figura) {
		this.figura = figura;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	

}
