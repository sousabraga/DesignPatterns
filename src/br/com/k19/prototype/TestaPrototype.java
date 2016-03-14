/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author matheus
 */
public class TestaPrototype {
    
    public static void main(String[] args) {
        
        String nome = "K19";
        
        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 30);
        
        Set<String> hashSet = new HashSet<>();
        
        hashSet.add("Curso");
        hashSet.add("Java");
        hashSet.add("K19");
        
        Campanha campanha = new Campanha(nome, vencimento, hashSet);
        System.out.println(campanha);
        
        Campanha clone = campanha.clone();
        System.out.println(clone);
    }
}
