package poli;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo ("Lycanrock","M","Qualquer");
		lobo.emitirSom();
		lobo.caminhar();
		
		Leão leão= new Leão("Solgaleo","M","Qualquer");
		leão.emitirSom();
		leão.dormir();
		
		Tigre tigre = new Tigre ("Zeraora","M","Qualquer");
		tigre.emitirSom();
		tigre.caminhar();
		
		Dog cachorro = new Dog ("Thor","M","Qualquer");
		cachorro.emitirSom();
		cachorro.correr();
		
		Cat gato= new Cat("Litten","M","Qualquer");
		gato.emitirSom();
		gato.dormir();

	}

}
