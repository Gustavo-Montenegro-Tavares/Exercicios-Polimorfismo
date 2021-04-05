
public class Lobo extends Animal implements Mamifero {
	
	private Pelo corPelo;

	public Lobo() {
		this.corPelo = new Pelo();
	}
	public void setCorPelo(String corPelo) {
		this.corPelo.setCorPelo(corPelo);;
	}

	
	public String getCorPelo() {
		System.out.println(this.corPelo);
		return this.corPelo.getCorPelo();
	}

	@Override
	public void locomover() {
		System.out.println("Anda sob quatro patas e corre");

	}

	@Override
	public void alimentar() {
		System.out.println("Se alimenta de suas caças");

	}

	@Override
	public void emitirSom() {
		System.out.println("Uiva");

	}

}
