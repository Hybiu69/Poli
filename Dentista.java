package poli;

public class Dentista extends ProfissionaisSaude{

	private String cro;

	public Dentista (String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
		this.cro=cro;
	}

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}
	@Override
	public void agendarConsulta() {
		System.out.println("agendando consulta");
	}
}



