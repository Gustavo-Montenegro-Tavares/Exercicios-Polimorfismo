
public class Gaviao extends Animal implements Ave{
	
	private Pena corPena;
	
	public Gaviao() {
		this.corPena = new Pena();
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	@Override
	public void alimentar() {
		System.out.println("De outras Aves");
	}
	@Override
	public void emitirSom() {
		System.out.println("Cantando, Assobiando "
				+ "e não deicando os outros dormirem");
	}
	@Override
	public void fazerNinho() {
		System.out.println("Colhendo gravetos");
	}
	
	public void setCorPena(String corPena) {
		this.corPena.setCorPena(corPena);
	}
	public String getCorPena() {
		return this.corPena.getCorPena();
	}
}
