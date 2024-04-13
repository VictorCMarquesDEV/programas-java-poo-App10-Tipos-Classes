package App10;

public final class Bolsista extends Aluno {
	private float bolsa;

	
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
	public void renovarBolsa() {
		System.out.println("Bolsa renovada de " + this.getNome());
	}
	
	@Override 
	public void pagarMensalidade() {
		System.out.println("Mensalidade paga do bolsista " + this.getNome());
	}
}
