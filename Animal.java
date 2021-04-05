
public abstract class Animal {
	private double peso;
	private int membros;
	private int idade;
	
	public  void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public int getMembros() {
		System.out.println("ele(a) possuem " + this.membros + " membros");
		return this.membros;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	

}

