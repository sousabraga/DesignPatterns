/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.flyweight;

import java.util.Arrays;

/**
 *
 * @author matheus
 */
public class TemaHifen implements TemaFlyweight {
       
    @Override
    public void imprime(String titulo, String texto) {
        System.out.println("----------" + titulo + "----------");
        System.out.println(texto);
        char[] rodape = new char[22 + titulo.length()];
        Arrays.fill(rodape, '-');
        System.out.println(new String(rodape));
    }
    
}
