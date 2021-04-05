
public class Cachorro extends Animal implements Mamifero {
	
	private Pelo corPelo;
	
	public Cachorro() {
		this.corPelo = new Pelo();
	}
	
	public void setCorPelo(String corPelo) {
		this.corPelo.setCorPelo(corPelo);
	}
	public String getCorPelo() {
		System.out.println(this.corPelo.getCorPelo());
		return this.corPelo.getCorPelo();
	}
	
	@Override
	public void locomover() {
		System.out.println("caminha pela casa");
	}
	@Override
	public void alimentar() {
		System.out.println("Come ração");
	}
	@Override
	public void emitirSom() {
		System.out.println("Late");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Olá")  || frase.equals("Oi")) {
			System.out.println("Abanar rabo");
		}else {
			System.out.println("Rosnar com raiva");
			this.emitirSom();
		}
	}
	public void reagir(int hora, int minuto){
		if(hora < 12) {
			System.out.println("Abanar o rabo");
		}else if (hora > 18) {
			System.out.println("Ignorar e pedir ração");
		}else {
			System.out.println("latir");
			this.emitirSom();
		}
	}
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar e latir");
		}else {
			System.out.println("Rosnar");
			this.emitirSom();
		}
	}
	
}
