package com.mycompany.main;

import java.util.*;
public class Emprego {
    
    private int idEmprego;
    private String nome;
    private double salario;
    
    
    public Emprego(int idEmprego, String nome, double salario) {
        
        this.idEmprego = idEmprego;
        this.nome = nome;
        this.salario = salario;
    
    }

    public int getIdEmprego() {
        return idEmprego;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}
