package pcmania.loja;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void mostraInfo() {
        if (getCapacidade() >= 1000) {
            System.out.println("Memoria USB: " + getNome() + " de " + getCapacidade() / 1000 + " TB");
        } else {
            System.out.println("Memoria USB: " + getNome() + " de " + getCapacidade() + " GB");
        }
    }
}