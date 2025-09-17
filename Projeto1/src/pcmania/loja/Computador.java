package pcmania.loja;

public class Computador {
    private String marca;
    private float preco;
    HardwareBasico processador;
    HardwareBasico memoriaRam;
    HardwareBasico hd;
    SistemaOperacional sistemaOperacional;

    MemoriaUSB musb;

    public float getPreco(){
        return preco;
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }

    public Computador(String marca, String processadorn,float preco, int capacidadep,int capacidadeMR,int capacidadeHD, String nomeO, int tipob){
        processador = new HardwareBasico(capacidadep,processadorn);
        memoriaRam = new HardwareBasico(capacidadeMR,"Memoria RAM");
        hd = new HardwareBasico(capacidadeHD,"HD");
        this.preco= preco;

        sistemaOperacional = new SistemaOperacional(nomeO,tipob);
        this.marca = marca;
    }
    public void mostraPCConfigs(){
        System.out.println("");
        System.out.println("Marca: "+ this.marca);
        System.out.println("Processador:" + processador.getNome() + " " + processador.getCapacidade() + " MHZ");
        if(hd.getCapacidade()>=1000){
            System.out.println("HD:" + hd.getNome()+ " " + hd.getCapacidade()/1000 + " TB");
        }else {
            System.out.println("HD:" + hd.getNome()+ " " + hd.getCapacidade() + " GB");
        }
        System.out.println("Memória RAM:" + memoriaRam.getNome() + " " + memoriaRam.getCapacidade() + " GB");
        System.out.println("SO:"+ sistemaOperacional.getNome() + " " + sistemaOperacional.getTipo() + " Bits");
        System.out.println("Preço: R$ " + getPreco());

        if(musb!= null){
         musb.mostraInfo();
        }
        System.out.println("");

    }

}
//    }