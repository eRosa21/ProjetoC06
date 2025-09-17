package pcmania.loja;

import java.util.Scanner;
import pcmania.cliente.Cliente;
import pcmania.cliente.ProcessarPedido;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opção;

        Cliente cliente = new Cliente();

        // cadastrar o cliente
        System.out.println(" Digite seu nome: ");
        cliente.setNome(sc.nextLine());

        System.out.println(" Digite seu CPF:");
        cliente.setCpf(sc.nextLine());


        System.out.println("Insiria sua matricula:");

        float matricula = sc.nextInt();


        Computador pc1 = new Computador("APPLE","Pentium Core i3",matricula,2200,8,500,"macOS Sequoia", 64);
        Computador pc2 = new Computador("SAMSUNG","Pentium Core i5", matricula +1234,3370,16, 1000,"Windows 8",64);
        Computador pc3 = new Computador("DELL","Pentium Corei i7",matricula + 5678,4500,32,2000,"Windows 10",64   );
        MemoriaUSB musb1 = new MemoriaUSB("Pendrive",16);
        MemoriaUSB musb2 = new MemoriaUSB("Pendrive",32);
        MemoriaUSB musb3 = new MemoriaUSB("HD Externo",1000);

        pc1.addMemoriaUSB(musb1);
        pc2.addMemoriaUSB(musb2);
        pc3.addMemoriaUSB(musb3);

        do{
        System.out.println("Escolha a promoção desejada:");
        System.out.println("Promoção 1 - Apple:  1");
        System.out.println("Promoção 2 - Samsung:  2");
        System.out.println("Promoção 3 - Dell:  3");
        System.out.println("Sair - 0");
        opção = sc.nextInt();

        switch (opção) {
            case 1:
                cliente.addPC(pc1);
                System.out.println("Computador 1 adicionado");

                break;
            case 2:
                cliente.addPC(pc2);
                System.out.println("Computador 2 adicionado");
                break;
            case 3:
                cliente.addPC(pc3);
                System.out.println("Computador 3 adicionado");
                break;
            case 0:
                System.out.println("Compra finalizada");
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
    }while(opção!=0);

        ProcessarPedido.processar(cliente.getComputadoresComprados());
        System.out.println("");

        //OBS: CRIEI ESSE TIMER SOMENTE PARA NÃO PRINTAR AUTOMATICAMENTE 
        try {
            Thread.sleep(3500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Pedido processado.");
        System.out.println("");
        cliente.mostraCarrinho();
        sc.close();
        }


    }