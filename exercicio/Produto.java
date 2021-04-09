package ted4q4;

public class Produto {
	private String nome;
	private double preço;
	private int quantidade;	
	
	public Produto(String nome, double preço, int quantidade) {
		super();
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	
	public void vendeuProduto () {
		this.quantidade = quantidade --;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preço=" + preço + "]";
	}
	
	

}
