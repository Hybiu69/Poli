package poli;

public class PrincipalProficional {

	public static void main(String[] args) {

		Medico medico = new Medico ("junior", " cardiologista " ,200 );
		System.out.println("                 medica                 ");
		System.out.println("Nome :" + medico.getNome());
		System.out.println("Especialidade :" + medico.getEspecialidade());
		System.out.println("Valor Consulta :" + medico.getValorConsulta());
		System.out.println("CRM :" + medico.getCrm());
		medico.agendarConsulta();

		Dentista dentista = new Dentista ("cesar", " Odontologia " ,150 );
		System.out.println("                 dentista                 ");
		System.out.println("Nome :" + dentista.getNome());
		System.out.println("Especialidade :" + dentista.getEspecialidade());
		System.out.println("Valor Consulta :" + dentista.getValorConsulta());
		System.out.println("CRO :" + dentista.getCro());
		dentista.agendarConsulta();

		Fisioterapeuta fisioterapeuta = new Fisioterapeuta ("junior", " cardiologista " ,200 );
		System.out.println("                 fisioterapeuta                 ");
		System.out.println("Nome :" + fisioterapeuta.getNome());
		System.out.println("Especialidade :" + fisioterapeuta.getEspecialidade());
		System.out.println("Valor Consulta :" + fisioterapeuta.getValorConsulta());
		System.out.println("crefito :" + fisioterapeuta.getCrefito());
		fisioterapeuta.agendarConsulta();

	}

}
