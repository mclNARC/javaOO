
package biblioteca;
public class Livros {
    private String titulo ;
    private String autor;
    private int quantidadeEstoque;
    private boolean disponivel;
    private int ano;
    private String tematica;
    private boolean reservado;
    
    public Livros (String t,String a, int q , int ano, String tematica) {
        this.titulo = t;
        this.autor = a;
        this.quantidadeEstoque = q;
        this.disponivel = true;
        this.ano = ano;
        this.tematica = tematica;
        this.reservado = false;
        
}   
    public void ExemplaresReservados (int r){
        if (r >= this.getQuantidadeEstoque()){
            this.disponivel = false;
            this.reservado = true;
        }
        
        
        
    }
    
    
    public String getTitulo(String t){
        return titulo;
    }
    public void setTitulo(String s){
        this.titulo = s;
        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        return "Livros{" + "titulo=" + titulo + ", autor="+ " \n " + autor + ", quantidadeEstoque=" + quantidadeEstoque + ", disponivel=" + disponivel + ", ano=" + ano + ", tematica=" + tematica + ", reservado=" + reservado + '}';
    }
    
    
    
    
    
    
}
