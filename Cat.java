package poli;

public class Cat extends Animal{
	public Cat (String nome,String sexo,String raca) {
		super (nome,sexo,raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O gato está miando");
	}
}
