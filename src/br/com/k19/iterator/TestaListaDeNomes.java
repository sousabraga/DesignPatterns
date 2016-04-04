/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.iterator;

import java.util.Iterator;

/**
 *
 * @author matheus
 */
public class TestaListaDeNomes {
 
    public static void main(String[] args) {
        
        String[] nomes = new String[4];
        nomes[0] = "Rafael Cosentino";
        nomes[1] = "Marcelo Martins";
        nomes[2] = "Jonas Hirata";
        nomes[3] = "Solange Domingos";

        ListaDeNomes listaDeNomes = new ListaDeNomes(nomes);
        Iterator<String> iterator = listaDeNomes.iterator();
        iterator.hasNext();
        iterator.remove();
        
        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println(nome);
        }
        
        System.out.println("--------------------------------");
        System.out.println("Testando o foreach");
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }
    }
}
