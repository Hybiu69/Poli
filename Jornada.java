package poli;

public class Jornada extends Funcionario{
	
	public Jornada (int id, int mat, String nome, String tel, String end) {
		super(id,mat,nome,tel,end);
	}
	
	@Override
	public double calcSala(double salarioH, double horadeT) {
		return salarioH*horadeT;
	}
}
