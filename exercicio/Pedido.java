package ted4q4;

public class Pedido {
	private Produto produto0;
	private Produto produto1;
	private Produto produto2;
	private Produto produto3;
	private Produto produto4;
	private Produto produto5;
	private Produto produto6;
	private Produto produto7;
	private Produto produto8;
	private Produto produto9;
	private Cliente pedido;
	private String pagamento;
	
	public Pedido(Produto produto0,Produto produto1,Produto produto2,Produto produto3,
			Produto produto4,Produto produto5,Produto produto6,Produto produto7,
			Produto produto8,Produto produto9,Cliente pedido, String p) {
		super();
		this.produto0 = produto0;
		this.produto1 = produto1;
		this.produto2 = produto2;
		this.produto3 = produto3;
		this.produto4 = produto4;
		this.produto5 = produto5;
		this.produto6 = produto6;
		this.produto7 = produto7;
		this.produto8 = produto8;
		this.produto9 = produto9;
		this.pedido = pedido;
		this.pagamento = p;
		
	}

	public Produto getProduto0() {
		return produto0;
	}

	public void setProduto0(Produto produto0) {
		this.produto0 = produto0;
	}

	public Produto getProduto1() {
		return produto1;
	}

	public void setProduto1(Produto produto1) {
		this.produto1 = produto1;
	}

	public Produto getProduto2() {
		return produto2;
	}

	public void setProduto2(Produto produto2) {
		this.produto2 = produto2;
	}

	public Produto getProduto3() {
		return produto3;
	}

	public void setProduto3(Produto produto3) {
		this.produto3 = produto3;
	}

	public Produto getProduto4() {
		return produto4;
	}

	public void setProduto4(Produto produto4) {
		this.produto4 = produto4;
	}

	public Produto getProduto5() {
		return produto5;
	}

	public void setProduto5(Produto produto5) {
		this.produto5 = produto5;
	}

	public Produto getProduto6() {
		return produto6;
	}

	public void setProduto6(Produto produto6) {
		this.produto6 = produto6;
	}

	public Produto getProduto7() {
		return produto7;
	}

	public void setProduto7(Produto produto7) {
		this.produto7 = produto7;
	}

	public Produto getProduto8() {
		return produto8;
	}

	public void setProduto8(Produto produto8) {
		this.produto8 = produto8;
	}

	public Produto getProduto9() {
		return produto9;
	}

	public void setProduto9(Produto produto9) {
		this.produto9 = produto9;
	}

	public Cliente getPedido() {
		return pedido;
	}

	public void setPedido(Cliente pedido) {
		this.pedido = pedido;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public String toString() {
		return "Pedido [" + produto0 + ", " + produto1 + ", \n" + produto2 + ", "
				+ produto3 + ", " + produto4 + ", " + produto5 + ", \n=" + produto6
				+ ", " + produto7 + ", produto8\n=" + produto8 + ",\n=" + produto9 + ", pedido=" + pedido
				+ ", pagamento=" + pagamento + "]";
	}
	
	

	


}
