package pcmania.cliente;

import pcmania.loja.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private int qtdComputadores;
    int cont = 0;

    public Computador[] computadoresComprados = new Computador[0];

    public Computador[] getComputadoresComprados() {
        return computadoresComprados;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf= cpf;
    }

    public Cliente(){
        this.computadoresComprados = new Computador[10];
        this.qtdComputadores = 0;
    }
    public float calculaTotalCompra(){
        float total = 00;
        for(int i = 0;i < cont; i++){
            total += computadoresComprados[i].getPreco();
        }
        return total;
    }
    public void addPC(Computador pc) {
        if (cont < computadoresComprados.length) {
            computadoresComprados[cont] = pc;
            cont++;
        }
    }
    public void mostraCarrinho(){
        System.out.println("Cliente: " + nome + " - CPF: " + cpf);
        System.out.println("Segue lista dos computadores comprados:");
        System.out.println("");
        for(int i = 0; i< cont; i++){
            System.out.println("Computador " + (i+1) + ":");
            computadoresComprados[i].mostraPCConfigs();
        }
        // não consigo fazer a soma do total
        System.out.println("Total da compra R$: " + calculaTotalCompra());
    }

    }

