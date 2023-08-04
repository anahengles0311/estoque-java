/*//Fazer um programa para ler os dados de um produto em estoque (nome, preço, 
 * e quantidade no estoque.) Em seguida:
 * Mostrar os dados do produto(nome, preço, quantidade no estoque, valor total
 * no estoque)
 * Realizar uma entrada no estoque e mostrar novamente os dados do produto
 * Realizar uma saída no estoque e mostrar novamente os dados do produto
 * 
 * Para resolver este problema, você deve criar uma CLASSE conforme projeto
 */

package estoqueOrientado;

import java.util.Scanner;

public class EstoqueOOP {

	public static void main(String[] args) {

		double valorTotal;

		EstoqueTotal prodEstoque;

		prodEstoque = new EstoqueTotal(); //criei um objeto

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do produto: ");

		prodEstoque.nomeProdutos = sc.nextLine();//correlacionei o objeto com o que eu preciso
		
		System.out.println("Digite o valor do produto: ");
		
		prodEstoque.precoProdutos = sc.nextDouble();//correlacionei o objeto com o que eu preciso
		
		System.out.println("Digite a quantidade do produto: ");

		prodEstoque.quantProduto = sc.nextInt();//correlacionei o objeto com o que eu preciso
		
		System.out.println( "\n " + prodEstoque.nomeProdutos  + "\nValor produto: " + prodEstoque.precoProdutos  + " \nQuantidade de produtos em estoque: "+ prodEstoque.quantProduto);
		
		System.out.println("Valor à adicionar em estoque: ");
		
		int entrada = sc.nextInt();
		
		prodEstoque.addProduto(entrada);
		
		System.out.println(prodEstoque.quantProduto);
		
		System.out.println("Produto à remover de estoque: ");
		
		int entradaValor = sc.nextInt();
		
		prodEstoque.removeProduto(entradaValor);
		
		System.out.println(prodEstoque.quantProduto);
		
		System.out.println(prodEstoque.totalEstoque());

	}

}
