package estoqueOrientado;

public class EstoqueTotal {
	public String nomeProdutos;
	public double precoProdutos;
	public int quantProduto;

	public double totalEstoque() {
		double newValue = precoProdutos * quantProduto;
		return newValue;
	}
	public void addProduto(int entrada) {
		this.quantProduto += entrada;		
	}
	public void removeProduto(int saida) {
		this.quantProduto -= saida;
	}
}
