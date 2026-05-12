package com.mycompany.main;
import java.util.ArrayList;
import java.util.Random;

public class Trabalho {
    
    private int idEmprego;
    private String nome;
    private double salario;
    double gastoEnergia;
    double karma = 100;
    int cargaHora;
    ArrayList<String>requisitos;
    
    JogadorSimulacao jogador = new JogadorSimulacao();

    public Trabalho (int idEmprego, String nome, double salario, double gastoEnergia) {
        
        this.idEmprego = idEmprego;
        this.nome = nome;
        this.salario = salario;
        this.gastoEnergia = gastoEnergia;
    
    }

    public int getIdTrabalho() {
        return idEmprego;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void marcarEntrevista(){
        
        Random rng = new Random();
        int gerador = rng.nextInt(100) + 1;
        
        if(gerador > 50){
            System.out.println("Parabéns você passou na entrevista, Contratado!!!");
            jogador.setEmprego(true);
        }else{
            System.out.println("Infelizmente você não foi contratado :(");
        }
    }

    public  void trabalhar(){
        if(jogador.isEmprego() == false) {
             System.out.println("Você precisa de um emprego para trabalhar!");
        return;
        }       

        double energiaAtual = jogador.getenergiaAtual();

        if(energiaAtual <= 0){
             System.out.println("Você está sem energia para trabalhar.");
        return;
        }

        JogadorSimulacao.setEnergia(energiaAtual - gastoEnergia);{

         System.out.println("Você trabalhou e perdeu 10 de energia.");
         System.out.println("Energia atual: " + jogador.getenergiaAtual());
        }
         


    }

    
    public void fazerHoraExtra(){
        if(jogador.isEmprego()){
            if(jogador.getenergiaAtual() >= 20 ){
                System.out.println("Você fez hora extra no seu trabalho. ");
                JogadorSimulacao.setEnergia(jogador.getenergiaAtual() - 20);
                System.out.println("Energia restante: " + jogador.getenergiaAtual());
            }else if(jogador.getenergiaAtual() == 0 ){
                System.out.println("Você está sem energia para fazer hora extra.");
            }else{
                System.out.println("Você precisa estar empregado para fazer hora extra.");
            }
        }
    }

    
}
