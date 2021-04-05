
public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected double experiencia;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public abstract void ganharExperiencia();
	
	@Override
	public String toString() {
		return "Pessoa: " + this.nome + ", Idade: " + idade + ", Sexo: " 
	+ this.sexo + ", Experiencia: " + this.experiencia;

	}
	
}
