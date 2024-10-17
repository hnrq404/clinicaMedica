public class Medico {
	private String nome;
	private int idade;
	private String crm;
	private String especialidade;
	private boolean disponivel = true;
	
	public Medico(String nome, int idade, String crm, String especialidade) {
		this.nome = nome;
		this.idade = idade;
		this.crm = crm;
		this.especialidade = especialidade;
	}
	
	public String getNome() {return nome;}
	public void setNome(String var) {this.nome = var;}
	
	public int getIdade() {return idade;}
	public void setIdade(int var) {this.idade = var;}
	
	public String getCrm() {return crm;}
	public void setCrm(String var) {this.crm = var;}
	
	public String getEspecialidade() {return especialidade;}
	public void setEspecialidade(String var) {this.especialidade = var;}
	
	public boolean getDisponivel() {return disponivel;}
	public void setDisponivel(boolean var) {this.disponivel = var;}
	
	public boolean verificarDisponibilidade() {
		return disponivel;
	}
	
	public void exibirDados() {
		System.out.println("Dados do medico: ");
		System.out.println("Nome: "+ nome +",\nIdade: "+ idade + ",\ncrm: "+ crm +",\nEspecialidade: "+ especialidade + "\n");
	}
}