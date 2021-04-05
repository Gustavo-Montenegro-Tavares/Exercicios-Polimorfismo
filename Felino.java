
public class Felino implements Mamifero {
	private Pelo corPelo;
	
	public Felino() {
		this.corPelo = new Pelo();
	}
	
	@Override
	public void locomover() {
		System.out.println("Caminhando sobre 4 patas");
	}
	@Override
	public void alimentar() {
		System.out.println("Come carne");
	}
	@Override
	public void emitirSom() {
		System.out.println("Ronrronar");
	}
	
	public String getCorPelo() {
		return this.corPelo.getCorPelo();
	}
	
	public void setCorPelo(String corPelo) {
		this.corPelo.setCorPelo(corPelo);
	}
}
