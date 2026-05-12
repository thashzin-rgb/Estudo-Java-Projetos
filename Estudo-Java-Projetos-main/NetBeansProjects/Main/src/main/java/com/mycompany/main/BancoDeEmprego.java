package com.mycompany.main;

import java.util.*;
public class BancoDeEmprego {
    
    private ArrayList<Emprego> vagas;
    
    public BancoDeEmprego(){
    
        vagas = new ArrayList<>();
        
        vagas.add(new Emprego(1, "Programador", 4000));
        vagas.add(new Emprego(2, "Repositor", 2500));
        vagas.add(new Emprego(3, "Vendedor", 3500));
    
    }
    
    /* método para pegar uma lista SÒ dos nomes dos empregos */
    public ArrayList<String> listarNomesEmpregos(){
        
        ArrayList<String> nomes = new ArrayList<>();
    
        for (Emprego e: vagas){
        nomes.add(e.getNome());
        
            
        }
         return nomes;
    }
    
    public Emprego buscarPorId(int id){
    
        for (Emprego e: vagas){
        
         if(e.getIdEmprego() == id){
             return e;
         }
        }
        
     return null;
    }
    
}
