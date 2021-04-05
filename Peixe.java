 
public class Peixe extends Animal implements Anfibios {
	
	private Escama corEscama;
	
	public Peixe() {
		this.corEscama = new Escama();
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");

	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substâncias");

	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");

	}
	@Override
	public void soltarBolha() {
		System.out.println("Soltando Bolha");
	

	}

	public String getCorEscama() {
		return this.corEscama.getCorEscama();
	}

	public void setCorEscama(String corEscama) {
		this.corEscama.setCorEscama(corEscama);
	}

}
