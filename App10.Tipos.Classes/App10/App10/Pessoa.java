package App10;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	public final void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
	public void detalhar() {
		System.out.println("=====================");
		System.out.println("Nome: " + this.getNome() + " (" + this.getIdade() + ")");
		System.out.println("Sexo: " + this.getSexo());
	}
}
