package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        
       Livros l[] = new Livros[1000];
       l[0]= new Livros ("A raposa do deserto","Erwin Rommel",10,1942,"Historia");
       l[0].ExemplaresReservados(10);
       
       l[1] = new Livros ("A arte da guerra ","Sun Tzu",7,400,"Historico");
       l[1].setDisponivel(true);
       
       l[2] = new Livros ("Wolverine","Marvel Studios",30,2009,"Revista em quadrinhos");
       
       l[3] = new Livros ("O apanhador do campo de centeio", "J.D Salinger",15,1951,"Romance");
       l[3].ExemplaresReservados(7);
       l[3].setDisponivel(true);
       
       l[4]= new Livros ("O alquimista","Paulo coelho",23,1988,"Conto");
       l[4].setDisponivel(true);
       
       
       
       
       
       
       
       System.out.println(l[0].toString());
       System.out.println(l[1].toString());
       
       
       
        
    }
    
}
