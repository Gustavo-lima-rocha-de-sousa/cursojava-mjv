package tipodecontato;

public class Sociais {

	private int FIXO;
	private int Celular;
	private int WHATSAPP;
		
	public Sociais(int fIXO, int celular, int wHATSAPP) {
		super();
		FIXO = fIXO;
		Celular = celular;
		WHATSAPP = wHATSAPP;
	}
	public int getFIXO() {
		return FIXO;
	}
	public int getCelular() {
		return Celular;
	}
	public int getWHATSAPP() {
		return WHATSAPP;
	}
	
	
	
}
