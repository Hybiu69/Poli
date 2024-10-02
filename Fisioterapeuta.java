package poli;

public class Fisioterapeuta extends ProfissionaisSaude {

	private String crefito;

	public Fisioterapeuta (String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
		this.crefito=crefito;
	}
	public String getCrefito() {
		return crefito;
	}
	public void setCrefito(String crefito) {
		this.crefito = crefito;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("agendando consulta");
	}
}


