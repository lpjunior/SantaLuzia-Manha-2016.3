package entidade;

public class Empregada {

	private Long id;
	private String nome;

	public Empregada() {

	}

	@Override
	public String toString() {
		return "\n\tID: " + id + "\n\tNome: " + nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
