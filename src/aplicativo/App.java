package aplicativo;

import entidade.Cliente;
import entidade.Cliente.FormaPagamento;
import entidade.Cliente.Tipo;
import entidade.Funcionario;
import entidade.Funcionario.Cargo;
import util.Criptografia;

public class App {
	public static void main(String[] args) {

		Cliente c = new Cliente();
		Funcionario f = new Funcionario();
		
		c.setNome("Fulano de Tal");
		c.setEmail("fulano@detal.com.br");
		c.setLogin("fulano");
		c.setSenha(Criptografia.geraMD5("123"));
		c.setTelefone("(21) 98752-1234");
		c.setFormaPagamento(FormaPagamento.CARTAO);
		c.setTipo(Tipo.PESSOA_FISICA);
		
		System.out.println(c.autentica("fulano", "123") ? "Cliente: Login efetuado" : "Cliente: Falha ao efetuar login");
		
		f.setNome("José da Silva");
		f.setEmail("jsilva@gmail.com");
		f.setLogin("jsilva");
		f.setSenha(Criptografia.geraMD5("2222"));
		f.setSetor("TI");
		f.setCargo(Cargo.ANALISTA);
		
		System.out.println(f.autentica("jsilva", "222") ? "Funcionario: Login efetuado" : "Funcionario: Falha ao efetuar login");
	}
}
