package poli;

public class Medico extends ProfissionaisSaude { 
	
	private String crm;
	
	public Medico (String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
		this.crm=crm;
}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	@Override
	public void agendarConsulta() {
		System.out.println("agendando consulta");
	}
}
