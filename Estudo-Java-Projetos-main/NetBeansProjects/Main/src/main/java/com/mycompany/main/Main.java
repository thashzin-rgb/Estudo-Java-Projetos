package com.mycompany.main;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        BancoDeEmprego bancoEmprego = new BancoDeEmprego();
        JogadorSimulacao jogador = new JogadorSimulacao();
        
        boolean loop = true;
        
        while(loop) {
            
            if(jogador.isEmprego() == false) {
            System.out.println("\n1--Procurar Emprego");
            }
            if(jogador.isEmprego() == true){
            System.out.println("\n1--Se Demitir");
            
          
            }
            System.out.println("2--Status");
            System.out.println("3--SAIR\n");
            
            
            int escolha = scan.nextInt();
            
            if(escolha == 1 && jogador.isEmprego() == true) {
                
                bancoEmprego.pedirDemicao();
                
            }
            
            switch (escolha) {
                case 1: 
                    System.out.println("\n1--Programador");
                    System.out.println("2--Repositor");
                    System.out.println("3--Vendedor");
                    System.out.println("4--Voltar\n");
                    
                    escolha = scan.nextInt();
                    switch (escolha){
                        
                        case 1: 
                            BancoDeEmprego banco = new BancoDeEmprego();
                            Emprego emprego = banco.buscarPorId(escolha);
                            
                            System.out.println("Profissão: "+ emprego.getNome());
                            System.out.println("Salário: " + emprego.getSalario());
                           
                            System.out.println("\n1--Agendar Entrevista"); 
                            System.out.println("2--voltar\n");
                            
                            escolha = scan.nextInt();
                            
                            switch(escolha){
                                
                                case 1: banco.marcarEntrevista();
                                    break;
                                case 2: 
                                    break;
                            
                            }
                            
                            break;
                            
                        case 2: 
                            break;
                        case 3: 
                            break;
                        case 4: 
                            break;
                    
                    }
                    break;
                case 2:  
                    jogador.status();
                    break;
                case 3: loop = false; break;
            }
            
        }
    }
}
