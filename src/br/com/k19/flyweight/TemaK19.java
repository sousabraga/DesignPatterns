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
public class TemaK19 implements TemaFlyweight {

    @Override
    public void imprime(String titulo, String texto) {
        System.out.println("##########" + titulo + "##########");
        System.out.println(texto);
        char[] rodapeE = new char[(int) Math.floor((6 + titulo.length()) / 2.0)];
        char[] rodapeD = new char[(int) Math.ceil((6 + titulo.length()) / 2.0)];
        Arrays.fill(rodapeE, '#');
        Arrays.fill(rodapeD, '#');
        System.out.println(new String(rodapeE) + " www.k19.com.br " + new String(rodapeD));
    }
    
}
