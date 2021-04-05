
public class ProjetoYoutube {
	
	public static void main(String [] args) {
		
		Video video[] = new Video[5];
		
		video[0] = new Video("Estudando POO");
		video[1] = new Video("Estudando Java");
		video[2] = new Video("Coisas interresantes na Espanha");
		video[3] = new Video("Video Aula de Violão");
		video[4] = new Video("Aula de exceções com professor Nico Steppat");
		
		video[2].setAvaliacao(10);
		video[2].play();
		
		for (int i = 0; i < video.length; i++) {
			System.out.println(video[i].toString());
		}
		
		Gafanhoto gafanhoto[] = new Gafanhoto[5];
		
		gafanhoto[0] = new Gafanhoto("Gustavo", 25,"Masculino" , "Gutu_12"); 
		gafanhoto[1] = new Gafanhoto("Marcel", 25, "Masculino", "LordCabelo");
		gafanhoto[2] = new Gafanhoto("Pedro", 25, "Masculino", "PedroAugust00z");
		gafanhoto[3] = new Gafanhoto("Eduarda", 14, "Feminino", "DudaCrazyPanda");
		gafanhoto[4] = new Gafanhoto("Thiago", 24, "Masculino", "ThiaGOD");
		
		for(int i = 0; i < gafanhoto.length; i++) {
			System.out.println(gafanhoto[i].toString());
		}
		
		Visualizacao visu[] = new Visualizacao[2];
		visu[0] = new Visualizacao(gafanhoto[0], video[0]);
		visu[0].getFilme().play();
		visu[0].avaliar(10);
		
		visu[1] = new Visualizacao(gafanhoto[1], video[1]);
		visu[1].getFilme().play();
		visu[1].avaliar(9);
		
		try {
			for(int i = 0; i < visu.length; i++){
				System.out.println("\n" + visu[i].toString());
			}
			
			
		}catch(NullPointerException ex) {
			System.out.printf(ex.getMessage());
		}
	
		
	}
}
