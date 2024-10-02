package poli;

public class Dog extends Animal{
	public Dog (String nome,String sexo,String raca) {
		super (nome,sexo,raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O Cachorro está latindo");
	}
}
