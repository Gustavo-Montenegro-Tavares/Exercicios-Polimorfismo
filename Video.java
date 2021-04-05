
public class Video implements acoesVideo{
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo){
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	@Override
	public void play() {
		this.reproduzindo = true;
		System.out.println("\nAssistindo ao vídeo\n" + "Reproduzindo: " + this.reproduzindo);
		//this.views++; pq o view esta sendo incrementado no construtor da classe Visualizacao
	}
	@Override
	public void pause() {
		System.out.println("Pausando o vídeo");
		this.reproduzindo = false;
		
	}
	@Override
	public void like() {
		System.out.println("Deixando um like no seu vídeo");
		this.curtidas++;
	}
	@Override
	public String toString() {
		return "Video- " + "Título: " + this.titulo + " Avalição: " + this.avaliacao + " Views: " + this.views + 
				" Curtidas: " + this.curtidas;
		
	}
	
	//--------getter e setters------------
	
	public int getViews() {
		return this.views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getAvaliacao() {
		return this.avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		try {
			int media = (this.avaliacao + avaliacao) / this.views;
			this.avaliacao = media;
		}catch(ArithmeticException ex) {
			if(this.views > 0) {
				int media = (this.avaliacao + avaliacao) / this.views;
				this.avaliacao = media;
			}
		}
		
	}

	public int getCurtidas() {
		return this.curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public boolean getReproduzindo() {
		return this.reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
}
