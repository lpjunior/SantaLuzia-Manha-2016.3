package entidade;

import util.Criptografia;
import util.Login;

public abstract class Pessoa implements Login {

	private String nome;
	private String email;
	private String login;
	private String senha;

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(String login, String senha) {
		senha = Criptografia.geraMD5(senha);
		if ((this.login.equalsIgnoreCase(login)) && (this.senha.equals(senha))) {
			return true;
		}
		return false;
	}
}
