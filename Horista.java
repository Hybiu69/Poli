package poli;

public class Horista extends Funcionario{
	
	public Horista (int id, int mat, String nome, String tel, String end) {
		super(id,mat,nome,tel,end);
	}
	
	@Override
	public double calcSala(double valorH, double horadeT) {
		return valorH*horadeT;
	}
}
