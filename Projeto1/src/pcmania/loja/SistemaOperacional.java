package pcmania.loja;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public String getNome(){
        return nome;
    }
    public int getTipo(){
        return tipo;
    }

    SistemaOperacional(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
}
