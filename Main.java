
public class Main {

	
	public static void main(String[] args) {
		
		Lagarto lagarto = new Lagarto();
		Peixe peixe = new Peixe();
		Lobo lobo = new Lobo();
		Gaviao gaviao = new Gaviao();
		Cachorro cachorro = new Cachorro();
		
		lagarto.locomover();
		lagarto.setCorEscama("verdes");
		lagarto.getCorEscama();
		System.out.println("-----------");
		
		peixe.locomover();
		peixe.setCorEscama("prateado");
		peixe.getCorEscama();
		peixe.soltarBolha();
		System.out.println("-----------");
		
		lobo.locomover();
		lobo.setCorPelo("Cinza");
		lobo.getCorPelo();
		System.out.println("-----------");
		
		gaviao.locomover();
		gaviao.alimentar();
		gaviao.emitirSom();
		gaviao.fazerNinho();
		gaviao.setMembros(2);
		gaviao.getMembros();
		System.out.println("-----------");
		
		cachorro.reagir(false);
		cachorro.reagir("Olá");
		cachorro.reagir(15, 00);
	}

}
