package faixaSalarial;

public class Salario {

	private Double valorMinimo;
	private Double valorMaximo;

	public Salario(Double valorMinimo, Double valorMaximo) {
		super();
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
	}

	public Double getValorMinimo() {
		return valorMinimo;
	}

	public Double getValorMaximo() {
		return valorMaximo;
	}

}
