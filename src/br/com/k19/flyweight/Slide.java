/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.flyweight;

/**
 *
 * @author matheus
 */
public class Slide {
 
    private TemaFlyweight tema;
    private String titulo;
    private String texto;
    
    public Slide(TemaFlyweight tema, String titulo, String texto) {
        this.tema = tema;
        this.titulo = titulo;
        this.texto = texto;
    }
    
    public void imprime() {
        this.tema.imprime(titulo, texto);
    }
}
