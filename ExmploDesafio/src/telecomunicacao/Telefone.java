package telecomunicacao;

public class Telefone {

	private Integer id;
	private Integer ddd;
	private Integer numero;
	
	public Telefone(Integer id, Integer ddd, Integer numero) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
	}
	public Integer getId() {
		return id;
	}
	public Integer getDdd() {
		return ddd;
	}
	public Integer getNumero() {
		return numero;
	}
	
	
	
}
