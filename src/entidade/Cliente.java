package entidade;

public class Cliente extends Pessoa {

	private String telefone;
	private FormaPagamento formaPagamento;
	private Tipo tipo;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public enum FormaPagamento {
		BOLETO, CARTAO;

		String getPagamento() {
			switch (this) {
			case BOLETO:
				return ("Boleto");
			case CARTAO:
				return ("Cartão");
			default:
				throw new AssertionError("Forma de pagamento incorreta" + this);
			}
		}
	}

	public enum Tipo {
		PESSOA_FISICA, PESSOA_JURIDICA;
	}
}
