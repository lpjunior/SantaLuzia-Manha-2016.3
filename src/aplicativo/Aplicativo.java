package aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entidade.Compra;
import entidade.Empregada;
import entidade.Produto;
import util.DestruidorDeObjetos;

public class Aplicativo {
	public static void main(String[] args) {

		// gerador de números aleatórios
		Random gerador = new Random();

		// Array de objetos
		List<Compra> compras = new ArrayList<Compra>();

		// Instanciando o objeto de compra na primeira posição do array
		compras.add(new Compra());
		compras.get(0).setId(new Long(gerador.nextInt(100) * 100));

		// Definindo a empregada
		compras.get(0).setEmpregada(new Empregada());
		compras.get(0).getEmpregada().setId(new Long(gerador.nextInt(100) * 100));
		compras.get(0).getEmpregada().setNome("Lucicleia");

		// Definindo a lista de produtos
		compras.get(0).setListaDeProdutos(new ArrayList<Produto>());
		/* Definindo o produto na lista */

		// Produto 01
		compras.get(0).getListaDeProdutos().add(new Produto());
		compras.get(0).getListaDeProdutos().get(0).setId(new Long(gerador.nextInt(100) * 100));
		compras.get(0).getListaDeProdutos().get(0).setNmProduto("Arroz");
		compras.get(0).getListaDeProdutos().get(0).setPreco(7.95);
		compras.get(0).getListaDeProdutos().get(0).setQuantidade(10.);

		// Produto 02
		compras.get(0).getListaDeProdutos().add(new Produto());
		compras.get(0).getListaDeProdutos().get(1).setId(new Long(gerador.nextInt(100) * 100));
		compras.get(0).getListaDeProdutos().get(1).setNmProduto("Feijão");
		compras.get(0).getListaDeProdutos().get(1).setPreco(3.8);
		compras.get(0).getListaDeProdutos().get(1).setQuantidade(3.2);

		// Produto 03
		compras.get(0).getListaDeProdutos().add(new Produto());
		compras.get(0).getListaDeProdutos().get(2).setId(new Long(gerador.nextInt(100) * 100));
		compras.get(0).getListaDeProdutos().get(2).setNmProduto("Farinha");
		compras.get(0).getListaDeProdutos().get(2).setPreco(10.25);
		compras.get(0).getListaDeProdutos().get(2).setQuantidade(50.1);

		/* Impressão */
		for (Compra compra : compras) {
			System.out.println(compra);
		}

		/* Destruindo o objeto */
		DestruidorDeObjetos.setNull(compras);
	}
}
