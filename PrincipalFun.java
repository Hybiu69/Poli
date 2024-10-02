package poli;

public class PrincipalFun {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario (1,123,"Joaquim","15-1111111","Rua x");
		System.out.println(fun.getNome());
		System.out.println(fun.calcSala(1500,700));
		
		Horista fun1 = new Horista(2,345,"Pedro","15-222222","Rua Y");
		System.out.println(fun1.getNome());
		System.out.println(fun1.calcSala(100,200));
		
		Jornada fun2 = new Jornada(3,678,"José","15-333333","Rua Z");
		System.out.println(fun2.getNome());
		System.out.println(fun2.calcSala(150,200));

		ConsultorPj fun3 = new ConsultorPj (3,101,"Pedro","15-222222","Rua A");
		System.out.println(fun3.getNome());
		System.out.println(fun3.calcSala(40000,5000));
		
		
	}
}
