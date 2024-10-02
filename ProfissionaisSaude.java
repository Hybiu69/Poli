package poli;

public class ProfissionaisSaude {

	private String nome, especialidade;
	private int valorConsulta;

	public ProfissionaisSaude (String nome, String especialidade, int vlorConsulta) {
		this.nome=nome;
		this.valorConsulta=valorConsulta;
		this.especialidade=especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(int valorConsulta) {
		this.valorConsulta = valorConsulta;
	} 
	public void agendarConsulta () {
		System.out.println("agendando consulta");
	}

}