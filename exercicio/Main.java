package ted4q4;

public class Main {

	public static void main(String[] args) {

	Produto produtos[] = new Produto[10];
	
	produtos[0] = new Produto ("Coca-Cola 2l R",6.0,80);
	produtos[1] = new Produto ("Amstel 600ml",5.99,300);
	produtos[2] = new Produto ("Coca-Cola 2l P",7.5,200);
	produtos[3] = new Produto ("h2o 1,5 l",6.45,50);
	produtos[4] = new Produto ("Red Label",79.9,35);
	produtos[5] = new Produto ("Black Label",113.9,15);
	produtos[6] = new Produto ("Brhama Duplo Malte 350ml",2.99,400);
	produtos[7] = new Produto ("Coca-Cola 1,5l P",5.5,35);
	produtos[8] = new Produto ("Pepsi Twist",5.90,50);
	produtos[9] = new Produto ("Fanta uva 2lt",6.0,40);
	
	Cliente clientes[]= new Cliente[500];
	
	clientes [0] = new Cliente("Maria","777.864.115-19");
	clientes [1] = new Cliente("João","384.355.646-91");
	clientes [2] = new Cliente("Felipe","143.563.654.-88");
	clientes [3] = new Cliente("Pedro","153.789.223-55");
	clientes [4] = new Cliente("Ana","141.960.304-74");
	
	
	Pedido pedidos[]= new Pedido[10000];
	
	pedidos[0] = new Pedido (produtos[0],produtos[0],produtos[3],produtos[5],
			produtos[1],produtos[2],produtos[1],produtos[7],produtos[9],produtos[4],
			clientes[1],"Cartão de crédito");
	System.out.println(pedidos[0].toString());

	
	
	
	}

}
