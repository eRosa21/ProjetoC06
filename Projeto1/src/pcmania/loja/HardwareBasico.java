package pcmania.loja;

public class HardwareBasico {
    private String nome;
    private int capacidade;

    HardwareBasico(int capacidade, String nome){
        this.capacidade = capacidade;
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public int getCapacidade(){
        return capacidade;
    }
}
