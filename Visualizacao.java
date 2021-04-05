
public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;
	
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
		
	}
	

	@Override
	public String toString() {
		return "Visualizacao [espectador: " + espectador + ", filme: " + filme + "]";
	}


	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(double porcentagem) {
		if(porcentagem <= 20) {
			this.filme.setAvaliacao(2);
		}else if(porcentagem <= 50) {
			this.filme.setAvaliacao(5);
		}else if (porcentagem <= 90) {
			this.filme.setAvaliacao(7);
		}else {
			this.filme.setAvaliacao(10);
		}
		
	}
	
	public String getEspectador() {
		return this.espectador.getLogin();
	}
	public void setEspectador(String nome) {
		this.espectador.setLogin(nome);
	}
	
	public Video getFilme() {
		return this.filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}
}
