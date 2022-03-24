package periodo3;

public class Aluno {

	private String nome;
	private int cpf;
	private String email;
	private boolean estaMestrando;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEstaMestrando() {
		return estaMestrando;
	}
	public void setEstaMestrando(boolean estaMestrando) {
		this.estaMestrando = estaMestrando;
	}
	
	@Override
	public String toString() {
		return "\nAluno: " + nome + "\nCPF: " + cpf + "\nE-mail: " + email;
	}
	
}
