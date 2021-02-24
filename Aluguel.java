package biblioteca;
public class Aluguel {
    private Aluno usuario;
    private Livros tituloAlugado;

    public Aluguel(Aluno usuario, Livros tituloAlugado) {
        this.usuario = usuario;
        this.tituloAlugado = tituloAlugado;
    }

    public Aluno getUsuario() {
        return usuario;
    }

    public void setUsuario(Aluno usuario) {
        this.usuario = usuario;
    }

    public Livros getTituloAlugado() {
        return tituloAlugado;
    }

    public void setTituloAlugado(Livros tituloAlugado) {
        this.tituloAlugado = tituloAlugado;
    }

    @Override
    public String toString() {
        return "Aluguel{" + "usuario=" + usuario + ", tituloAlugado=" + tituloAlugado + '}';
    }
    
    
    
    
    
    
}
