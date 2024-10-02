package poli;

public class Funcionario {
	private int id,mat;
	private String nome,tel,end;


	public Funcionario (int id, int mat, String nome, String tel, String end) {
		this.id=id;
		this.mat=mat;
		this.nome=nome;
		this.tel=tel;
		this.end=end;
	}
	public double calcSala(double salaBru,double desc) {
		return salaBru-desc;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

}