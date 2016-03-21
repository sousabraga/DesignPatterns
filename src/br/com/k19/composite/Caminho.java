/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class Caminho implements Trecho {
    
    private List<Trecho> trechos;

    public Caminho() {
        this.trechos = new ArrayList<>();
    }
    
    public void adiciona(Trecho trecho) { 
        this.trechos.add(trecho);
    }
    
    public void remove(Trecho trecho) {
        this.trechos.remove(trecho);
    }
        
    @Override
    public void imprime() {
        this.trechos.stream().forEach(trecho -> { 
            trecho.imprime();
        });
    }
    
}
