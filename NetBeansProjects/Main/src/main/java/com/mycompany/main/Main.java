package com.mycompany.main;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BancoDeEmprego bancoEmprego = new BancoDeEmprego();
        
        boolean loop = true;
        
        while(loop) {
            
            System.out.println("1--Procurar Emprego");
            System.out.println("2--SAIR");
            
            int escolha = scan.nextInt();
            
            switch (escolha) {
                case 1: 
                    System.out.println("1--Programador");
                    System.out.println("2--Repositor");
                    System.out.println("3--Vendedor");
                    
                    escolha = scan.nextInt();
                    switch (escolha){
                        
                        case 1: 
                            BancoDeEmprego banco = new BancoDeEmprego();
                            Emprego emprego = banco.buscarPorId(escolha);
                            
                            System.out.println("Profissão: "+ emprego.getNome());
                            System.out.println("Salário: " + emprego.getSalario());
                            
                            break;
                    
                    }
                    break;
                case 2: loop = false; break;
            }
            
        }
    }
}
