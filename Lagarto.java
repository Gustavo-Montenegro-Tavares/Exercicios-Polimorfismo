
public class Lagarto extends Animal implements Reptil {
		
	private Escama corEscama;
	
	public Lagarto() {
		this.corEscama = new Escama();
	}
	
	@Override
	public void locomover() {
		System.out.println("Rastejando");

	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Vegetais");

	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Réptil");

	}
	
	public void setCorEscama(String corEscama) {
		this.corEscama.setCorEscama(corEscama);
	}
	public String getCorEscama() {
		return this.corEscama.getCorEscama();
	}

}
