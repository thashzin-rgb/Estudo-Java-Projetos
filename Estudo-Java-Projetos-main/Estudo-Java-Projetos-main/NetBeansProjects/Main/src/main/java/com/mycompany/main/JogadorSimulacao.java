package com.mycompany.main;

public class JogadorSimulacao {

    private static String nome = "Arthur";
    private static int idade = 19;
    private static double energiaAtual = 100;
    private static boolean emprego = false;


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getenergiaAtual() {
        return energiaAtual;
    }

    public boolean isEmprego() {
        return emprego;
    }

    /*
     * public JogadorSimulacao(String nome, int idade, int energia, boolean
     * emprego){
     * 
     * this.nome = nome;
     * this.idade = idade;
     * this.energia = energia;
     * this.emprego = emprego;
     * 
     * } Construtor pré feito
     */

    public void status() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energiaAtual);
        System.out.println("Emprego: " + this.emprego);

    }

    public static void setNome(String nome) {
        JogadorSimulacao.nome = nome;
    }

    public static void setIdade(int idade) {
        JogadorSimulacao.idade = idade;
    }

    public static void setEnergia(double energiaAtual) {
        JogadorSimulacao.energiaAtual = energiaAtual;
    }

    public static void setEmprego(boolean emprego) {
        JogadorSimulacao.emprego = emprego;
    }

}
