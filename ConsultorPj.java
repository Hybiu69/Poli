package poli;

public class ConsultorPj extends Funcionario{
	
	public ConsultorPj(int id, int mat, String nome, String tel, String end) {
		super(id,mat,nome,tel,end);
	}
	
	@Override
	public double calcSala(double valorT, double imposto) {
		return valorT-imposto;
	}
}
