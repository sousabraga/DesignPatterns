/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.multiton;

/**
 *
 * @author matheus
 */
public class TestaTema {
    
    public static void main(String[] args) {
        
        System.out.println("----- Tema FIRE -----");
        
        Tema temaFire = Tema.getInstance(Tema.FIRE);
        System.out.println("Tema: " + temaFire.getNome());
        System.out.println("Cor da fonte: " + temaFire.getCorDaFonte());
        System.out.println("Cor do fundo: " + temaFire.getCorDoFundo());
        
        Tema temaFire2 = Tema.getInstance(Tema.FIRE);
        
        System.out.println("----------------------------------");
        System.out.println("Comparando as referências...");
        System.out.println(temaFire == temaFire2);
        
        System.out.println("----- Tema SKY -----");
        
        Tema temaSky = Tema.getInstance(Tema.SKY);
        System.out.println("Tema: " + temaSky.getNome());
        System.out.println("Cor da fonte: " + temaSky.getCorDaFonte());
        System.out.println("Cor do fundo: " + temaSky.getCorDoFundo());
        
        Tema temaSky2 = Tema.getInstance(Tema.SKY);
        
        System.out.println("----------------------------------");
        System.out.println("Comparando as referências...");
        System.out.println(temaSky == temaSky2);
        
        
    }
}
